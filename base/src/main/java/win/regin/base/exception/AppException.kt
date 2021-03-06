package win.regin.base.exception

import win.regin.base.ext.parseErrorString

/**
 * @author :Reginer in  2019/7/8 9:41.
 *         联系方式:QQ:282921012
 *         功能描述:错误
 */

class AppException : Exception {
    var errorMsg: String

    constructor(error: String?) : super(error) {
        errorMsg = error ?: parseError(null)
    }

    constructor(throwable: Throwable?) : super(throwable) {
        errorMsg = parseError(throwable)
    }

    private fun parseError(throwable: Throwable?): String {
        return throwable.parseErrorString()
    }
}