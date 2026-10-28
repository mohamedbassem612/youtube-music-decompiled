package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tmx implements tny {
    private final tmo a;
    private final String b;

    public tmx(tmo tmoVar, String str) {
        this.a = tmoVar;
        this.b = str;
    }

    @Override // defpackage.tny
    public final ainp a() {
        tmt tmtVar;
        tmr tmrVarD = this.a.d(this.b);
        if (tmrVarD == null || (tmtVar = tmrVarD.b) == null) {
            return null;
        }
        return tmtVar.j;
    }

    @Override // defpackage.tny
    public final void b(awqg awqgVar) {
        this.a.k(this.b, new hph(new awri(), awqgVar, 16, null));
    }
}
