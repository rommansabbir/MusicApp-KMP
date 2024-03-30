package musicapp_kmp.player

interface MediaPlayerListener {
    fun onReady()
    fun onAudioCompleted()
    fun onError()
}
