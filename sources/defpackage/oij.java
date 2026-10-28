package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oij {
    public agev a;
    public boolean b;
    public byte c;
    private boolean d;
    private final agev e;
    private final agev f;
    private final agev g;

    public oij() {
        agdf agdfVar = agdf.a;
        this.a = agdfVar;
        this.e = agdfVar;
        this.f = agdfVar;
        this.g = agdfVar;
    }

    public final oik a() {
        if (this.c == 15) {
            oik oikVar = new oik(this.d, this.a, this.e, this.f, this.g, this.b);
            boolean z = oikVar.a;
            agev agevVar = oikVar.b;
            if (z) {
                if (agevVar.g()) {
                    throw new IllegalArgumentException();
                }
            } else if (!agevVar.g()) {
                throw new IllegalArgumentException("Request must provide a group name prefix or a source to filter by");
            }
            return oikVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" includeAllGroups");
        }
        if ((this.c & 2) == 0) {
            sb.append(" groupWithNoAccountOnly");
        }
        if ((this.c & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.c & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 1);
    }
}
