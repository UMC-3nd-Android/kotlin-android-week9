/**
 * made by bmsk
 * updated 2022-11-27
 */

package org.umc.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.umc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBeforeBinding()
        initView()
        initAfterBinding()
    }

    private fun initView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        initButtons(binding)
        setContentView(binding.root)
    }

    private fun initAfterBinding() {}

    private fun initBeforeBinding() {}

    private fun initBottomNavigation() {}

    private fun initButtons(binding: ActivityMainBinding) {
        val wbhamButton = binding.btnWbham
        val maddyButton = binding.btnMaddy
        val jaeeeppButton = binding.btnJaeeepp
        val arrButton = binding.btnArr

        wbhamButton.setOnClickListener {
            replaceWbhamActivity()
        }
        maddyButton.setOnClickListener {
            replaceMaddyActivity()
        }
        jaeeeppButton.setOnClickListener {
            replaceJaeeeppActivity()
        }
        arrButton.setOnClickListener {
            replaceArrActivity()
        }
    }

    private fun replaceMainActivity() {}

    private fun replaceMaddyActivity() {
        intent = Intent(this, MaddyActivity::class.java)
        startActivity(intent)
    }

    private fun replaceWbhamActivity() {
        intent = Intent(this, WbhamActivity::class.java)
        startActivity(intent)
    }

    private fun replaceJaeeeppActivity() {
        intent = Intent(this, JaeeeppActivity::class.java)
        startActivity(intent)
    }

    private fun replaceArrActivity() {
        intent = Intent(this, ArrActivity::class.java)
        startActivity(intent)
    }
}