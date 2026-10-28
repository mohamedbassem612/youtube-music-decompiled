package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aelo implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ aihn c;

    public /* synthetic */ aelo(aels aelsVar, aptm aptmVar, boolean z, int i) {
        this.$cid = i;
        this.b = aelsVar;
        this.c = aptmVar;
        this.a = z;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        ajwo ajwoVar;
        if (this.$cid == 0) {
            Throwable th = (Throwable) obj;
            aptm aptmVar = (aptm) this.c;
            if ((aptmVar.c & 8) != 0) {
                ajwoVar = aptmVar.g;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
            ((aels) this.b).d(ajwoVar, this.a, th);
            return;
        }
        String str = (String) obj;
        Object obj2 = this.b;
        if (str != null) {
            ((jmg) obj2).v(str);
        }
        if (this.a) {
            jmg jmgVar = (jmg) obj2;
            if (jmgVar.az != 3) {
                jmgVar.M();
            }
            if (jmgVar.az == 3 && ((apym) this.c).j) {
                jmgVar.M();
            }
        }
    }

    public /* synthetic */ aelo(jmg jmgVar, boolean z, apym apymVar, int i) {
        this.$cid = i;
        this.b = jmgVar;
        this.a = z;
        this.c = apymVar;
    }
}
