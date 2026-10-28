package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atr {
    public Notification B;
    public RemoteViews C;
    public RemoteViews D;
    public String E;
    public String F;
    public long G;
    public final Notification I;

    @Deprecated
    public final ArrayList J;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public String g;
    public PendingIntent h;
    public IconCompat i;
    public CharSequence j;
    public int k;
    public int l;
    public auu n;
    public CharSequence o;
    public CharSequence[] p;
    public int q;
    public int r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public String x;
    public Bundle y;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean m = true;
    public boolean w = false;
    public int z = 0;
    public int A = 0;
    public int H = 0;

    public atr(Context context, String str) {
        Notification notification = new Notification();
        this.I = notification;
        this.a = context;
        this.E = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.l = 0;
        this.J = new ArrayList();
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static String d(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            return null;
        }
        return string.length() > 5120 ? string.substring(0, 5120) : string;
    }

    public final Notification a() {
        dep depVar = new dep(this);
        atr atrVar = (atr) depVar.d;
        auu auuVar = atrVar.n;
        if (auuVar != null) {
            auuVar.f(depVar);
        }
        Notification notificationBuild = ((Notification.Builder) depVar.c).build();
        RemoteViews remoteViews = atrVar.C;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (auuVar != null) {
            atrVar.n.j();
            Bundle bundle = notificationBuild.extras;
            if (bundle != null) {
                auuVar.i(bundle);
            }
        }
        return notificationBuild;
    }

    public final Bundle b() {
        Bundle bundle = this.y;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.y = bundle2;
        return bundle2;
    }

    public final void e(int i, boolean z) {
        Notification notification = this.I;
        if (z) {
            notification.flags |= i;
        } else {
            notification.flags &= ~i;
        }
    }

    public final void f(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new atn(i, charSequence, pendingIntent));
    }

    public final void g(atn atnVar) {
        if (atnVar != null) {
            this.b.add(atnVar);
        }
    }

    public final void h(Bundle bundle) {
        Bundle bundle2 = this.y;
        if (bundle2 == null) {
            this.y = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    public final void i(RemoteViews remoteViews) {
        this.I.contentView = remoteViews;
    }

    public final void j(CharSequence charSequence) {
        this.j = c(charSequence);
    }

    public final void k(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void l(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void m(int i) {
        Notification notification = this.I;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void n(PendingIntent pendingIntent) {
        this.I.deleteIntent = pendingIntent;
    }

    public final void o(Bitmap bitmap) {
        IconCompat iconCompatF;
        if (bitmap == null) {
            iconCompatF = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatF = IconCompat.f(bitmap);
        }
        this.i = iconCompatF;
    }

    public final void p(int i, int i2, boolean z) {
        this.q = i;
        this.r = i2;
        this.s = z;
    }

    public final void q(int i) {
        this.I.icon = i;
    }

    public final void r(auu auuVar) {
        if (this.n != auuVar) {
            this.n = auuVar;
            if (auuVar == null || auuVar.h == this) {
                return;
            }
            auuVar.h = this;
            atr atrVar = auuVar.h;
            if (atrVar != null) {
                atrVar.r(auuVar);
            }
        }
    }

    public final void s(CharSequence charSequence) {
        this.o = c(charSequence);
    }

    public final void t(CharSequence charSequence) {
        this.I.tickerText = c(charSequence);
    }

    public final void u(long[] jArr) {
        this.I.vibrate = jArr;
    }

    public final void v(long j) {
        this.I.when = j;
    }
}
