package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abzl implements ktg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ abzl(abzn abznVar, String str, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = abznVar;
        this.b = str;
        this.c = zwaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zwa] */
    @Override // defpackage.ktg
    public final void a(String str) {
        if (this.$cid != 0) {
            ((vwb) this.c).a((String) this.a, str, (byte[]) this.b);
            return;
        }
        aihf aihfVarCreateBuilder = ajgu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajgu ajguVar = (ajgu) aihfVarCreateBuilder.instance;
        Object obj = this.b;
        obj.getClass();
        ajguVar.b |= 1;
        ajguVar.e = (String) obj;
        aihfVarCreateBuilder.copyOnWrite();
        ajgu ajguVar2 = (ajgu) aihfVarCreateBuilder.instance;
        str.getClass();
        ajguVar2.c = 3;
        ajguVar2.d = str;
        ((abzn) this.a).c(Optional.of((ajgu) aihfVarCreateBuilder.build()), this.c);
    }

    public /* synthetic */ abzl(vwb vwbVar, String str, byte[] bArr, int i) {
        this.$cid = i;
        this.c = vwbVar;
        this.a = str;
        this.b = bArr;
    }
}
