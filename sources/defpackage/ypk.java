package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypk extends zir {
    private final ypm b;
    private final mbc c;
    private final yup d;
    private final zjr e;
    private ypj f;
    private final hed g;

    public ypk(byw bywVar, ypm ypmVar, mbc mbcVar, yup yupVar, hed hedVar, zjr zjrVar) {
        super(bywVar);
        this.b = ypmVar;
        this.c = mbcVar;
        this.d = yupVar;
        this.g = hedVar;
        this.e = zjrVar;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.brv
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int iA;
        try {
            mbc mbcVar = this.c;
            long jB = mbcVar.b();
            iA = super.a(bArr, i, i2);
            long jB2 = mbcVar.b();
            ypj ypjVar = this.f;
            if (ypjVar != null) {
                ypjVar.g(jB, jB2, iA);
            }
        } catch (byt e) {
            ypj ypjVar2 = this.f;
            if (ypjVar2 == null) {
                throw e;
            }
            ypjVar2.e(e, this.c.b());
            throw e;
        }
        return iA;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final synchronized long b(byi byiVar) {
        long jB;
        mbc mbcVar = this.c;
        ypj ypjVar = new ypj(byiVar, mbcVar.b(), this.b, this.d, this.g, this.e.dk());
        this.f = ypjVar;
        try {
            jB = super.b(byiVar);
            ypjVar.h(mbcVar.b());
        } catch (byt e) {
            ypjVar.e(e, this.c.b());
            throw e;
        }
        return jB;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final synchronized void f() {
        try {
            super.f();
            ypj ypjVar = this.f;
            if (ypjVar != null) {
                ypjVar.d(this.c.b());
            }
            this.f = null;
        } catch (byt e) {
            ypj ypjVar2 = this.f;
            if (ypjVar2 != null) {
                ypjVar2.e(e, this.c.b());
            }
            throw e;
        }
    }

    @Override // defpackage.zir
    public final synchronized int w(ByteBuffer byteBuffer) {
        int iW;
        try {
            mbc mbcVar = this.c;
            long jB = mbcVar.b();
            iW = super.w(byteBuffer);
            long jB2 = mbcVar.b();
            ypj ypjVar = this.f;
            if (ypjVar != null) {
                ypjVar.g(jB, jB2, iW);
            }
        } catch (byt e) {
            ypj ypjVar2 = this.f;
            if (ypjVar2 == null) {
                throw e;
            }
            ypjVar2.e(e, this.c.b());
            throw e;
        }
        return iW;
    }
}
