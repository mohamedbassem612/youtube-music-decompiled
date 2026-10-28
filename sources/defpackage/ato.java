package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ato {
    static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }

    public static CharSequence d(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static boolean e(Notification notification) {
        return (notification.flags & SemanticState.LiveRegion) != 0;
    }

    public static long f(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void g(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    public void h() {
    }

    public void i() {
    }
}
