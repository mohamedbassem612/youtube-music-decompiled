package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yxy extends yzb {
    private final float[] b;
    private final ahud c;

    public yxy(ahud ahudVar, yye yyeVar) {
        super(yyeVar);
        this.c = ahudVar;
        this.b = new float[4];
    }

    private final void l() {
        ahud ahudVar = this.c;
        float[] fArr = this.b;
        ahudVar.t(fArr);
        super.k(fArr[3], fArr[0], fArr[1], fArr[2]);
    }

    @Override // defpackage.yzb, defpackage.buj
    public final ByteBuffer c() {
        l();
        return super.c();
    }

    @Override // defpackage.yzb, defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        l();
        super.f(byteBuffer);
    }
}
