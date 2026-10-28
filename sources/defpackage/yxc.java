package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxc {
    public yxf a;
    public akfp b;
    private agke c;
    private agke d;
    private int e;
    private int f;
    private int g;
    private byte h = 7;

    public yxc(yxd yxdVar) {
        yws ywsVar = (yws) yxdVar;
        this.c = ywsVar.a;
        this.d = ywsVar.b;
        this.e = ywsVar.c;
        this.f = ywsVar.d;
        this.g = ywsVar.e;
        this.a = ywsVar.f;
        this.b = ywsVar.g;
    }

    public final yxd a() {
        agke agkeVar;
        agke agkeVar2;
        yxf yxfVar;
        if (this.h == 7 && (agkeVar = this.c) != null && (agkeVar2 = this.d) != null && (yxfVar = this.a) != null) {
            yws ywsVar = new yws(agkeVar, agkeVar2, this.e, this.f, this.g, yxfVar, this.b);
            ahno.O(ywsVar.a.size() / ywsVar.c == ywsVar.b.size() / ywsVar.d);
            return ywsVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" vertexCoords");
        }
        if (this.d == null) {
            sb.append(" textureCoords");
        }
        if ((this.h & 1) == 0) {
            sb.append(" vertexDim");
        }
        if ((this.h & 2) == 0) {
            sb.append(" textureDim");
        }
        if ((this.h & 4) == 0) {
            sb.append(" drawMode");
        }
        if (this.a == null) {
            sb.append(" mediaGlProgramType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.g = i;
        this.h = (byte) (this.h | 4);
    }

    public final void c(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null textureCoords");
        }
        this.d = agkeVar;
    }

    public final void d() {
        this.f = 2;
        this.h = (byte) (this.h | 2);
    }

    public final void e(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null vertexCoords");
        }
        this.c = agkeVar;
    }

    public final void f() {
        this.e = 2;
        this.h = (byte) (this.h | 1);
    }
}
