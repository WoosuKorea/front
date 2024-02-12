//package com.korea.history.android.login
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.activity.viewModels
//import com.kakao.sdk.auth.model.OAuthToken
//import com.kakao.sdk.common.KakaoSdk
//import com.kakao.sdk.common.model.ClientError
//import com.kakao.sdk.common.model.ClientErrorCause
//import com.kakao.sdk.user.UserApiClient
//import com.korea.history.android.MainActivity
//import com.korea.history.android.R
//import dagger.hilt.android.AndroidEntryPoint
//
//
//@AndroidEntryPoint
//class KakaoActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        KakaoSdk.init(this, KAKAO_API_KEY)
//        kakaoLogin()
//        subscribeObservables()
//        setContentView(R.layout.activity_kakao)
//    }
//
//    private val viewModel: AuthViewModel by viewModels()
//
//    private val kakaoClient: UserApiClient by lazy { UserApiClient.instance }
//
//    private val kakaoOAuthCallBack: (OAuthToken?, Throwable?) -> Unit = { token, _ ->
//        token?.let {
//            // 성공했을떄 토큰 보내는 로직
//        }
//    }
//    private val isKakaoTalkInstalled
//        get() = kakaoClient.isKakaoTalkLoginAvailable(this)
//
//    private val isClientErrorCancelled: (Throwable?) -> Boolean = { error ->
//        error is ClientError && error.reason == ClientErrorCause.Cancelled
//    }
//
//    private fun kakaoLogin() {
//        if (isKakaoTalkInstalled) {
//            handleKakaoTalkLoginResult()
//        } else {
//            kakaoClient.loginWithKakaoAccount(this, callback = kakaoOAuthCallBack)
//        }
//    }
//    private fun handleKakaoTalkLoginResult() {
//        kakaoClient.loginWithKakaoTalk(this) { token, error ->
//            if (isClientErrorCancelled(error)) return@loginWithKakaoTalk
//            error?.let { kakaoClient.loginWithKakaoAccount(this, callback = kakaoOAuthCallBack) }
//            token?.let {
//                // 성공 했을떄 토큰보내는 ㅍ로직
//            }
//        }
//    }
//    private fun subscribeObservables() {
//        viewModel.loginResult.filterNotNull().collectWithLifecycle(this) {
//            if (it.accessToken.isEmpty()) return@collectWithLifecycle
//            val intent = Intent(this@KakaoActivity, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//    }
//    companion object {
//        const val KAKAO_API_KEY = BuildConfig.KAKAO_API_KEY
//    }
//}