package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyc {
    public final xbz a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;

    public wyc(xbz xbzVar) {
        this.a = xbzVar;
        this.b = R.attr.ytTextPrimary;
        this.c = R.attr.ytIconDisabled;
        this.d = R.attr.ytTextPrimary;
        this.e = R.attr.ytTextPrimary;
        this.f = R.drawable.live_chat_classic_picker_button_background;
        this.g = R.drawable.live_chat_classic_input_background_default;
        this.h = R.drawable.live_chat_classic_input_background_multiline;
        this.i = true;
    }

    public static wyc a() {
        return new wyc(new xbz(R.attr.ytAdditiveBackground, R.attr.ytTextPrimary, R.attr.ytTextSecondary, R.attr.ytTextPrimaryInverse));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wyc) {
            wyc wycVar = (wyc) obj;
            if (this.a.equals(wycVar.a) && this.b == wycVar.b && this.c == wycVar.c && this.d == wycVar.d && this.e == wycVar.e && this.f == wycVar.f && this.g == wycVar.g && this.h == wycVar.h && this.i == wycVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ (-58804091);
        int i = true != this.i ? 1237 : 1231;
        int i2 = this.b;
        int i3 = (((((((((iHashCode * 1000003) ^ i2) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ 1237;
        return (((((((((i3 * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ 1237) * 1000003) ^ i;
    }

    public final String toString() {
        return "InputActionPanelDialogRenderingContext{shouldEmitLiveChatReelWatchInputFocusedEvent=false, shouldNotifyInputTopLocationChanged=false, characterCounterColors=" + String.valueOf(this.a) + ", activeSendButtonColor=" + this.b + ", inactiveSendButtonColor=" + this.c + ", pdgMoneyButtonColor=" + this.d + ", iconColor=" + this.e + ", shouldForceDarkThemeContext=false, pickerButtonBackground=" + this.f + ", inputBackgroundSingleLine=" + this.g + ", inputBackgroundMultiLine=" + this.h + ", shouldUseUpdatedHorizontalMargins=false, shouldUseUpdatedHorizontalEndMargins=" + this.i + '}';
    }

    public wyc() {
        throw null;
    }
}
