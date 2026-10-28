package defpackage;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yws extends yxd {
    public final agke a;
    public final agke b;
    public final int c;
    public final int d;
    public final int e;
    public final yxf f;
    public final akfp g;
    private volatile transient Buffer h;
    private volatile transient Buffer i;
    private volatile transient int j;
    private volatile transient boolean k;
    private volatile transient int l;
    private volatile transient boolean m;

    public yws(agke agkeVar, agke agkeVar2, int i, int i2, int i3, yxf yxfVar, akfp akfpVar) {
        this.a = agkeVar;
        this.b = agkeVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = yxfVar;
        this.g = akfpVar;
    }

    @Override // defpackage.yxd
    public final int a() {
        return this.e;
    }

    @Override // defpackage.yxd
    public final int b() {
        return this.d;
    }

    @Override // defpackage.yxd
    public final int c() {
        return this.c;
    }

    @Override // defpackage.yxd
    public final yxf d() {
        return this.f;
    }

    @Override // defpackage.yxd
    public final agke e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxd) {
            yxd yxdVar = (yxd) obj;
            if (aguu.v(this.a, yxdVar.f()) && aguu.v(this.b, yxdVar.e()) && this.c == yxdVar.c() && this.d == yxdVar.b() && this.e == yxdVar.a() && this.f.equals(yxdVar.d())) {
                akfp akfpVar = this.g;
                if (akfpVar == null) {
                    if (yxdVar.g() == null) {
                        return true;
                    }
                } else if (akfpVar.equals(yxdVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yxd
    public final agke f() {
        return this.a;
    }

    @Override // defpackage.yxd
    public final akfp g() {
        return this.g;
    }

    @Override // defpackage.yxd
    public final int h() {
        if (!this.m) {
            synchronized (this) {
                if (!this.m) {
                    this.l = this.d << 2;
                    this.m = true;
                }
            }
        }
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        akfp akfpVar = this.g;
        return (iHashCode * 1000003) ^ (akfpVar == null ? 0 : akfpVar.hashCode());
    }

    @Override // defpackage.yxd
    public final int i() {
        if (!this.k) {
            synchronized (this) {
                if (!this.k) {
                    this.j = this.c << 2;
                    this.k = true;
                }
            }
        }
        return this.j;
    }

    @Override // defpackage.yxd
    public final Buffer j() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    agke agkeVar = this.b;
                    this.i = ByteBuffer.allocateDirect(agkeVar.size() << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(afxw.K(agkeVar)).position(0);
                    if (this.i == null) {
                        throw new NullPointerException("textureBuffer() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }

    @Override // defpackage.yxd
    public final Buffer k() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    agke agkeVar = this.a;
                    this.h = ByteBuffer.allocateDirect(agkeVar.size() << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(afxw.K(agkeVar)).position(0);
                    if (this.h == null) {
                        throw new NullPointerException("vertexBuffer() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    public final String toString() {
        akfp akfpVar = this.g;
        yxf yxfVar = this.f;
        agke agkeVar = this.b;
        return "MediaGlProgramShaderInput{vertexCoords=" + this.a.toString() + ", textureCoords=" + agkeVar.toString() + ", vertexDim=" + this.c + ", textureDim=" + this.d + ", drawMode=" + this.e + ", mediaGlProgramType=" + yxfVar.toString() + ", convolutionMatrix=" + String.valueOf(akfpVar) + '}';
    }
}
