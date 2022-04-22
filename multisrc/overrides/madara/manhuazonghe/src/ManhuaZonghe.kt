package eu.kanade.tachiyomi.extension.en.manhuazonghe

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.network.GET
import okhttp3.CacheControl
import okhttp3.Request

class ManhuaZonghe : Madara("ManhuaZonghe", "https://manhuazonghe.com", "en") {

    override fun popularMangaRequest(page: Int): Request {
        return GET(
            "$baseUrl/tags/manhua-english/?m_orderby=views",
            formHeaders,
            CacheControl.FORCE_NETWORK
        )
    }
}
