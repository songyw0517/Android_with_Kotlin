package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.scof.howtousepalette.databinding.ActivityRecyclerviewBinding
import com.scof.howtousepalette.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class RecyclerviewActivity : AppCompatActivity() {
    private val binding by lazy { ActivityRecyclerviewBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        // 1. 데이터를 불러온다
        val data = loadData() // 가상의 데이터 생성

        // 2. 아답터 생성
        val customAdapter = CustomerAdapter(data)

        // 3. 화면의 RecyclerView와 연결
        binding.recyclerView.adapter = customAdapter

        // 4. 레이아웃 매니저 설정 (목록 형태, 그리드 형태 등등으로 보여줄 수 있음)
        binding.recyclerView.layoutManager = LinearLayoutManager(this) // LinearLayout으로 보여줌

        

    }
    fun loadData() : MutableList<Memo>{
        // 100개의 메모를 생성 및 메모 리스트에 담아 반환
        
        val memoList = mutableListOf<Memo>()
        for(no in 1..100){
            val title = "이것이 안드로이드다 $no"
            val date = System.currentTimeMillis()
            val memo = Memo(no, title, date)
            memoList.add(memo)
        }
        return memoList

    }
}
class CustomerAdapter(val listData:MutableList<Memo>) : RecyclerView.Adapter<CustomerAdapter.Holder>() {
    // RecycleView.Adapter은 RecyclerView 전체를 관리하는 것
    // item_recycler.xml 내의 구성요소 하나하나를 관리하는 것이 '홀더'
    // CustomerAdapter은 MutableList<Memo>형인 listData를 받아 생성된다.

    // CustomerAdapter가 아래의 홀더 클래스를 가지고 item_recycler의 레이아웃 값을 세팅함을 의미
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        // 화면에 보이는 만큼만 생성해 놓고, 스크롤시 재사용하는 뷰 -> RecyclerView
        // 즉 화면에 30개의 레이아웃만 보여줄 수 있다면 30개의 레이아웃을 보여주고
        // 스크롤을 내리면 새로운 부분의 값을 다시 부여하여 보여주는 뷰

        // ItemRecycler를 바인딩
        // Layout의 전체를 사용하는 것이 아니기에 inflate의 첫번째 함수가 아닌 두번째 함수를 사용한다. (매개변수가 3개인 것)
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        // 화면에 보여준 레이아웃 이외를 보여줄 때 사용하는 메소드
        // 스크롤 할 때 재사용하는 부분이다.
        // position : 목록 아이템의 위치

        // 1. 사용할 데이터를 꺼내고
        val memo = listData.get(position)

        // 2. 홀더에 데이터를 전달
        holder.setMemo(memo)

    }
    class Holder(val binding:ItemRecyclerBinding):RecyclerView.ViewHolder(binding.root){
        lateinit var currentMemo: Memo
        // 클릭처리는 init에서만 해야한다
        init {
            binding.root.setOnClickListener{
                Toast.makeText(binding.root.context, "클릭된 아이템 : ${currentMemo.title}", Toast.LENGTH_SHORT).show()
            }
        }

        // 3. 홀더는 받은 데이터를 화면에 출력한다.
        fun setMemo(memo: Memo){
            currentMemo = memo
            with(binding){
                textNo.text = "${memo.no}"
                textTitle.text = "${memo.title}"

                val sdf = SimpleDateFormat("yyyy-MM-dd")
                val formattedDate = sdf.format(memo.timestamp)
                textDate.text = formattedDate
            }
        }
    }
    // 한줄짜리 코드는 다음과 같이 줄일 수 있다.
    override fun getItemCount() = listData.size// 목록의 개수를 알려주는 함수
}