package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lfr implements ldb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ lfv a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public lfr(lfv lfvVar, String str, List list, int i) {
        this.$cid = i;
        this.c = str;
        this.b = list;
        this.a = lfvVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ldb
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        byte[] bArr2;
        int i2;
        Object objSubstring;
        int i3 = this.$cid;
        lfv lfvVar = this.a;
        if (i3 != 0) {
            lfvVar.L(true, i, th, bArr, (String) this.c, this.b, map);
            return;
        }
        lfvVar.A();
        lfvVar.D();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                lfvVar.p = false;
                lfvVar.E();
            }
        } else {
            bArr2 = bArr;
        }
        Object obj = this.c;
        Object obj2 = this.b;
        if (i != 200) {
            i2 = 204;
            if (i != 204) {
                i2 = i;
            }
            String str2 = new String(bArr2, StandardCharsets.UTF_8);
            objSubstring = str2.substring(0, Math.min(32, str2.length()));
            lcx lcxVar = lfvVar.aT().h;
            Integer numValueOf = Integer.valueOf(i2);
            if (th != null) {
                objSubstring = th;
            }
            lcxVar.d("Network upload failed. Will retry later. appId, status, error", obj2, numValueOf, objSubstring);
            lfvVar.v().U(Long.valueOf(((lfw) obj).a));
            lfvVar.V();
        }
        i2 = i;
        if (th == null) {
            lfvVar.v().R(Long.valueOf(((lfw) obj).a));
            lfvVar.aT().k.c("Successfully uploaded batch from upload queue. appId, status", obj2, Integer.valueOf(i2));
            if (lfvVar.l().c() && lfvVar.v().ac((String) obj2)) {
                lfvVar.ab((String) obj2);
            } else {
                lfvVar.V();
            }
        } else {
            String str3 = new String(bArr2, StandardCharsets.UTF_8);
            objSubstring = str3.substring(0, Math.min(32, str3.length()));
            lcx lcxVar2 = lfvVar.aT().h;
            Integer numValueOf2 = Integer.valueOf(i2);
            if (th != null) {
                objSubstring = th;
            }
            lcxVar2.d("Network upload failed. Will retry later. appId, status, error", obj2, numValueOf2, objSubstring);
            lfvVar.v().U(Long.valueOf(((lfw) obj).a));
            lfvVar.V();
        }
    }

    public lfr(lfv lfvVar, String str, lfw lfwVar, int i) {
        this.$cid = i;
        this.b = str;
        this.c = lfwVar;
        this.a = lfvVar;
    }
}
