package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bxw implements bye {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private byi d;

    protected bxw(boolean z) {
        this.a = z;
    }

    @Override // defpackage.bye
    public /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(bzgVar)) {
            return;
        }
        arrayList.add(bzgVar);
        this.c++;
    }

    protected final void g(int i) {
        byi byiVar = this.d;
        int i2 = bwp.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((bzg) this.b.get(i3)).a(this, byiVar, this.a, i);
        }
    }

    protected final void h() {
        byi byiVar = this.d;
        int i = bwp.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((bzg) this.b.get(i2)).b(this, byiVar, this.a);
        }
        this.d = null;
    }

    protected final void i(byi byiVar) {
        for (int i = 0; i < this.c; i++) {
            ((bzg) this.b.get(i)).c(this, byiVar, this.a);
        }
    }

    protected final void j(byi byiVar) {
        this.d = byiVar;
        for (int i = 0; i < this.c; i++) {
            ((bzg) this.b.get(i)).d(this, byiVar, this.a);
        }
    }
}
