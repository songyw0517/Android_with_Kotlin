# values 디렉토리
- xml의 속성을 관리하는 폴더
    ## string.xml
    - 텍스트 값을 관리
    - 다언어로 개발할 때 편리
    - 오타처리에 편리
    ``` xml
    <resources>
        <string name="app_name">Base09_Listener</string>

        <string name="button_text">I am button</string>
        <string name="hello">Hi Hello</string>
    </resources>
    ```
    ## dimens.xml
    - 크기 (dp, sp)를 관리
    ``` xml
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <dimen name="button_height">100dp</dimen>
        <dimen name="text_size">50sp</dimen>

    </resources>
    ```
    ## colors.xml
    - 색상 관리
    ``` xml
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <color name="purple_200">#FFBB86FC</color>
        <color name="purple_500">#FF6200EE</color>
        <color name="purple_700">#FF3700B3</color>
        <color name="teal_200">#FF03DAC5</color>
        <color name="teal_700">#FF018786</color>
        <color name="black">#FF000000</color>
        <color name="white">#FFFFFFFF</color>
    </resources>
    ```
# XML
- Component
    ## 텍스트 뷰 (TextView)
    - background : 배경
    - id : 아이디
    - text : 텍스트
    - textColor : 텍스트 색상
    - textSize : 텍스트 크기
    - maxLines : 최대로 보여지는 줄 수 
    - minLines : 최소 보여지는 줄 수
    - singleLine : 여러줄을 한 줄로
    - ellipsize : 어느 부분을 줄일지
    - fontFamily : 폰트
    - maxLength : 최대 보여지는 글자수

    ## 라디오 그룹 (Radio Group)
    - orientation : 라디오버튼을 어떻게 정렬할지 선택
    
    ## 체크 박스 (Check Box)