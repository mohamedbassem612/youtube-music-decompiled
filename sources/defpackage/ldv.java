package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldv implements Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ lcn d;

    public ldv(lcn lcnVar, String str, String str2, String str3, int i) {
        this.$cid = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.$cid;
        if (i == 0) {
            lfv lfvVar = this.d.a;
            lfvVar.B();
            String str = this.c;
            String str2 = this.b;
            return lfvVar.v().D(this.a, str2, str);
        }
        if (i == 1) {
            lfv lfvVar2 = this.d.a;
            lfvVar2.B();
            String str3 = this.c;
            String str4 = this.a;
            return lfvVar2.v().D(this.b, str4, str3);
        }
        lcn lcnVar = this.d;
        if (i != 2) {
            lfv lfvVar3 = lcnVar.a;
            lfvVar3.B();
            String str5 = this.c;
            String str6 = this.b;
            return lfvVar3.v().r(this.a, str6, str5);
        }
        lfv lfvVar4 = lcnVar.a;
        lfvVar4.B();
        String str7 = this.c;
        String str8 = this.a;
        return lfvVar4.v().r(this.b, str8, str7);
    }

    public ldv(lcn lcnVar, String str, String str2, String str3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = lcnVar;
    }
}
