package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ddv {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    private final cwj g;
    private long h;

    public ddv(cwj cwjVar) {
        this.g = cwjVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.e = i3 + (i2 - i);
            } else {
                this.c = ((bArr[i4] & 192) >> 6) == 0;
                this.b = false;
            }
        }
    }

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
    public final void b(long j, int i, boolean z) {
        ahno.O(this.f != -9223372036854775807L);
        if (this.d == 182 && z && this.a) {
            this.g.e(this.f, this.c ? 1 : 0, (int) (j - this.h), i, null);
        }
        if (this.d != 179) {
            this.h = j;
        }
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = -1;
    }
}
