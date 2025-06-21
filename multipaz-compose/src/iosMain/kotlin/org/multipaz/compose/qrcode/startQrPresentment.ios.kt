package org.multipaz.compose.qrcode

import androidx.compose.runtime.MutableState
import kotlinx.io.bytestring.ByteString
import org.multipaz.models.presentment.PresentmentModel

actual fun startQrPresentment(
    presentmentModel: PresentmentModel,
    deviceEngagement: MutableState<ByteString?>
) {
    // TODO: Implement QR code presentment for iOS
}