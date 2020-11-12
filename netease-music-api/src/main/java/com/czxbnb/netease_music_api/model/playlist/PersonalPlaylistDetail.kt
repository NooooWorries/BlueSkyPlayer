package com.czxbnb.netease_music_api.model.playlist

data class PersonalPlaylistDetail(
    val code: Int,
    val playlist: Playlist,
    val privileges: List<Privilege>,
    val relatedVideos: Any,
    val urls: Any
)

data class Privilege(
    val chargeInfoList: List<ChargeInfo>,
    val cp: Int,
    val cs: Boolean,
    val dl: Int,
    val downloadMaxbr: Int,
    val fee: Int,
    val fl: Int,
    val flag: Int,
    val freeTrialPrivilege: FreeTrialPrivilege,
    val id: Int,
    val maxbr: Int,
    val payed: Int,
    val pl: Int,
    val playMaxbr: Int,
    val preSell: Boolean,
    val sp: Int,
    val st: Int,
    val subp: Int,
    val toast: Boolean
)

data class TrackId(
    val alg: Any,
    val at: Long,
    val id: Int,
    val v: Int
)

data class Track(
    val a: Any,
    val al: Al,
    val alia: List<String>,
    val ar: List<Ar>,
    val cd: String,
    val cf: String,
    val copyright: Int,
    val cp: Int,
    val crbt: Any,
    val djId: Int,
    val dt: Int,
    val fee: Int,
    val ftype: Int,
    val h: Any,
    val id: Int,
    val l: L,
    val m: M,
    val mark: Int,
    val mst: Int,
    val mv: Int,
    val name: String,
    val no: Int,
    val noCopyrightRcmd: Any,
    val originCoverType: Int,
    val pop: Int,
    val pst: Int,
    val publishTime: Long,
    val rt: Any,
    val rtUrl: Any,
    val rtUrls: List<Any>,
    val rtype: Int,
    val rurl: Any,
    val s_id: Int,
    val st: Int,
    val t: Int,
    val tns: List<String>,
    val v: Int
)

data class Al(
    val id: Int,
    val name: String,
    val pic: Long,
    val picUrl: String,
    val pic_str: String,
    val tns: List<String>
)

data class Ar(
    val alias: List<Any>,
    val id: Int,
    val name: String,
    val tns: List<Any>
)

data class L(
    val br: Int,
    val fid: Int,
    val size: Int,
    val vd: Int
)

data class M(
    val br: Int,
    val fid: Int,
    val size: Int,
    val vd: Int
)

data class ChargeInfo(
    val chargeMessage: Any,
    val chargeType: Int,
    val chargeUrl: Any,
    val rate: Int
)

data class FreeTrialPrivilege(
    val resConsumable: Boolean,
    val userConsumable: Boolean
)