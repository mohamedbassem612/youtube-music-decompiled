package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hcf {
    public agke a;
    public String b;
    public aqmh c;
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private agke f;
    private agke g;
    private String h;

    public final hcg a() {
        agke agkeVar;
        String str;
        agke agkeVar2 = this.a;
        if (agkeVar2 != null && !agkeVar2.isEmpty()) {
            agke agkeVar3 = this.f;
            if (agkeVar3 == null) {
                throw new IllegalStateException("Property \"trackList\" has not been set");
            }
            ahno.F(agkeVar3.size() == this.a.size());
        }
        agke agkeVar4 = this.f;
        if (agkeVar4 != null && (agkeVar = this.g) != null && (str = this.h) != null) {
            return new hcg(this.d, this.e, agkeVar4, agkeVar, this.a, str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" trackList");
        }
        if (this.g == null) {
            sb.append(" trackDownloadMetadataList");
        }
        if (this.h == null) {
            sb.append(" containerId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null containerId");
        }
        this.h = str;
    }

    public final void c(weh wehVar) {
        this.e = Optional.ofNullable(wehVar);
    }

    public final void d(weh wehVar) {
        this.d = Optional.of(wehVar);
    }

    public final void e(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null trackDownloadMetadataList");
        }
        this.g = agkeVar;
    }

    public final void f(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null trackList");
        }
        this.f = agkeVar;
    }
}
