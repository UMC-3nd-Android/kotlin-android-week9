/**
 * made by Maddy
 * updated 2022-11-27
 */

package org.umc.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.umc.R

class MaddyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maddy)
    }
}

/**
 * 구현 완료하면 지워도 좋음
 *
 * 무의미한 파일 명, 클래스 명, 함수 명, 혹은 겹치기 쉬운 이름 사용에 주의 말 것
 * ex) aabb.kt -> 어떤 파일인지 한 눈에 보이지 않음
 * ex) data.kt -> 다른 개발자와 겹칠 수 있음
 *
 * 함수가 길어진다 싶으면 그 함수가 하는 일이 너무 많은 것일 수 있음
 * 함수를 분리하기
 * ex)
 * fun createFileAndRunAppAndEtc() {
 *      이거 하고
 *
 *      이거도 하고
 *
 *      다른 것도 다 하고
 * }
 *
 * 문자열 관리 -> strings_<id>.xml
 *
 * adapter 관리 -> org.umc.ui.adapter
 * data 관리 -> org.umc.data
 * activity 관리 -> org.umc.ui.view
 * fragment 관리 -> org.umc.ui.view
 * api 관리 -> data.remote.api
 *
 *
 * 전역 변수 사용에 주의해서 사용할 것
 */