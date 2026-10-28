package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyl extends adyj {
    public final anfv q;
    public final boolean r;

    public adyl(String str, anfv anfvVar) {
        super(str);
        this.q = anfvVar;
        boolean z = false;
        if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & 16384) != 0) {
            if ((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).i) {
                z = true;
            }
        }
        this.r = z;
    }

    @Override // defpackage.adyj, defpackage.qny, defpackage.qnx
    public final boolean c() {
        if (this.r) {
            return false;
        }
        return this.a;
    }
}
