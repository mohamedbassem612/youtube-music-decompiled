package defpackage;

import android.os.Handler;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aemm {
    private static final Set d = EnumSet.allOf(aeml.class);
    public final aekz a;
    public final Set b;
    public boolean c;
    private final Handler e;

    public aemm(aekz aekzVar, Handler handler) {
        aekzVar.getClass();
        this.a = aekzVar;
        handler.getClass();
        this.e = handler;
        this.b = EnumSet.noneOf(aeml.class);
    }

    public final void a(aeml... aemlVarArr) {
        Set set = this.b;
        set.addAll(Arrays.asList(aemlVarArr));
        if (this.c || !set.containsAll(d)) {
            return;
        }
        this.e.post(new aemk(this, 0));
        this.c = true;
    }
}
