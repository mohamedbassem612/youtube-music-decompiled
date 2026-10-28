package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvx implements acwm {
    final /* synthetic */ aofx a;
    final /* synthetic */ aoia b;
    final /* synthetic */ Map c;
    final /* synthetic */ int d;
    final /* synthetic */ gvy e;

    public gvx(gvy gvyVar, aofx aofxVar, aoia aoiaVar, Map map, int i) {
        this.a = aofxVar;
        this.b = aoiaVar;
        this.c = map;
        this.d = i;
        this.e = gvyVar;
    }

    @Override // defpackage.acwm
    public final void b() {
        this.e.d(this.a, Optional.of(this.b), this.c);
    }

    @Override // defpackage.acwm
    public final void c(boolean z) {
        gvy gvyVar = this.e;
        taf.j(gvyVar.c.b(new gvw(gvyVar.e, this.d, 0)), new glo(14));
    }

    @Override // defpackage.acwm
    public final void a() {
    }
}
