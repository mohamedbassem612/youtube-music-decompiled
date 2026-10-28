package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atu extends auu {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int g;
    private avc l;
    private IconCompat m;
    private CharSequence n;

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.g = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.l = ats.c(fd$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = avc.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = aaj.g((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.e(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.e = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final atn c(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.h.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.h.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.h.a;
        aie.f(context);
        atn atnVarH = aag.h(IconCompat.g(context.getResources(), context.getPackageName(), i), atr.c(spannableStringBuilder), pendingIntent, new Bundle(), null);
        atnVarH.a.putBoolean("key_action_priority", true);
        return atnVarH;
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        CharSequence string = null;
        Notification.CallStyle callStyleA = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.g;
            if (i == 1) {
                callStyleA = att.a(ats.b(this.l), this.b, this.a);
            } else if (i == 2) {
                callStyleA = att.b(ats.b(this.l), this.c);
            } else if (i == 3) {
                callStyleA = att.c(ats.b(this.l), this.c, this.a);
            }
            if (callStyleA != null) {
                callStyleA.setBuilder((Notification.Builder) depVar.c);
                Integer num = this.e;
                if (num != null) {
                    att.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    att.e(callStyleA, num2.intValue());
                }
                att.h(callStyleA, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    att.g(callStyleA, aaj.e(iconCompat, this.h.a));
                }
                att.f(callStyleA, this.d);
                return;
            }
            return;
        }
        Object obj = depVar.c;
        avc avcVar = this.l;
        Notification.Builder builder = (Notification.Builder) obj;
        builder.setContentTitle(avcVar != null ? avcVar.a : null);
        Bundle bundle = this.h.y;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.h.y.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.g;
            if (i2 == 1) {
                string = this.h.a.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i2 == 2) {
                string = this.h.a.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i2 == 3) {
                string = this.h.a.getResources().getString(R.string.call_notification_screening_text);
            }
        } else {
            string = charSequence;
        }
        builder.setContentText(string);
        avc avcVar2 = this.l;
        if (avcVar2 != null) {
            IconCompat iconCompat2 = avcVar2.b;
            if (iconCompat2 != null) {
                builder.setLargeIcon(aaj.e(iconCompat2, this.h.a));
            }
            int i3 = Build.VERSION.SDK_INT;
            avc avcVar3 = this.l;
            if (i3 >= 28) {
                ats.a(builder, ats.b(avcVar3));
            } else {
                builder.addPerson(avcVar3.c);
            }
        }
        builder.setCategory("call");
    }

    @Override // defpackage.auu
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("android.callType", this.g);
        bundle.putBoolean("android.callIsVideo", this.d);
        if (this.l != null) {
            int i = Build.VERSION.SDK_INT;
            avc avcVar = this.l;
            if (i >= 28) {
                bundle.putParcelable("android.callPerson", ats.b(avcVar));
            } else {
                bundle.putParcelable("android.callPersonCompat", avcVar.a());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", aaj.e(iconCompat, this.h.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
