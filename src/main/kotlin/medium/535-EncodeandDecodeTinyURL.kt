package medium

import java.util.*
import java.util.concurrent.atomic.AtomicInteger


class `535-EncodeandDecodeTinyURL` {
    private val base64 = Base64.getUrlEncoder().withoutPadding()
    private val map = mutableMapOf<String, String>()
    private val prefix = "http://tinyurl.com/"

    fun encode(longUrl: String): String {
        val encodedUrl = base64.encodeToString(longUrl.toByteArray())
        val key = prefix + encodedUrl
        map[key] = longUrl
        return key
    }

    fun decode(shortUrl: String): String {
        return map[shortUrl] ?: throw IllegalArgumentException("Invalid URL")
    }
}

class Codec {
    var urlToIdMap: MutableMap<String, String> = HashMap<String, String>()
    var ai: AtomicInteger = AtomicInteger()

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        val url = ai.incrementAndGet()
        val url62 = encode(url.toLong())
        urlToIdMap[url62] = longUrl
        return url62
    }

    // Decodes a shortened URL to its original URL.
    fun decode(url62: String?): String? {
        return urlToIdMap[url62]
    }

    private val CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    fun encode(value: Long): String {
        var value = value
        val sb = StringBuilder()
        do {
            sb.append(CHARACTERS[(value % 62).toInt()])
            value /= 62
        } while (value > 0)
        return sb.reverse().toString()
    }
}


fun main() {
    println(`535-EncodeandDecodeTinyURL`().encode("https://leetcode.com/problems/design-tinyurl/"))
}