package defpackage;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dvl implements dvm {
    public static final Set a = new HashSet();
    private final String b;
    private final String c;

    public dvl(String str, String str2) {
        this.b = str;
        this.c = str2;
        a.add(this);
    }

    public abstract boolean a();

    @Override // defpackage.dvm
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dvm
    public final boolean c() {
        return a() || d();
    }

    public boolean d() {
        Set set = dvb.a;
        String str = this.c;
        if (set.contains(str)) {
            return true;
        }
        return ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) && set.contains(str.concat(":dev"));
    }
}
