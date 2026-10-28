package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gde {
    public String a;
    public String b;
    public int c;
    public final Map d;
    public gdi e;
    public String f;
    public String g;
    public Executor h;

    public gde() {
        String.format("Android %s", Build.VERSION.RELEASE);
        this.a = "_s";
        this.b = "https://csi.gstatic.com/csi";
        this.c = 1;
        this.d = new LinkedHashMap();
        this.h = null;
    }
}
