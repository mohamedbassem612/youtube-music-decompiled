package defpackage;

import android.os.Build;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lby extends lea {
    private long a;
    private String b;

    public final long a() {
        m();
        return this.a;
    }

    public final String b() {
        m();
        return Build.MODEL;
    }

    public final String c() {
        m();
        return Build.VERSION.RELEASE;
    }

    public final String d() {
        m();
        return this.b;
    }

    @Override // defpackage.lea
    protected final boolean e() {
        Calendar calendar = Calendar.getInstance();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long j = calendar.get(15) + calendar.get(16);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        this.a = j / 60000;
        Locale locale = Locale.getDefault();
        this.b = locale.getLanguage().toLowerCase(Locale.ENGLISH) + '-' + locale.getCountry().toLowerCase(Locale.ENGLISH);
        return false;
    }
}
