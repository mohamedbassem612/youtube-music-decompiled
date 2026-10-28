package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abut {
    public String a;
    public Object b;
    private boolean c;
    private byte d;
    private Object e;
    private Object f;
    private Object g;

    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    public final abuu a() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.d == 1 && (obj = this.e) != null && (obj2 = this.f) != null && (obj3 = this.g) != null) {
            abuu abuuVar = new abuu((abnl) obj, (abnp) obj2, this.c, this.a, this.b, (agke) obj3);
            ahno.F(abuu.j(abuuVar.a));
            return abuuVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" playbackStartDescriptor");
        }
        if (this.f == null) {
            sb.append(" playbackStartParameters");
        }
        if (this.d == 0) {
            sb.append(" supportsPlaybackQueue");
        }
        if (this.g == null) {
            sb.append(" sequenceItems");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(abnl abnlVar) {
        if (abnlVar == null) {
            throw new NullPointerException("Null playbackStartDescriptor");
        }
        this.e = abnlVar;
    }

    public final void c(abnp abnpVar) {
        if (abnpVar == null) {
            throw new NullPointerException("Null playbackStartParameters");
        }
        this.f = abnpVar;
    }

    public final void d(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null sequenceItems");
        }
        this.g = agkeVar;
    }

    public final void e(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final jla f() {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        ager agerVar = new ager("-");
        String str2 = this.a;
        if (str2 == null) {
            throw new IllegalStateException("Property \"label\" has not been set");
        }
        String strE = wfs.e(145, agerVar.b(agke.r("SingleSelectMusicSortFilterButtonBuilder", Integer.valueOf(str2.hashCode()))));
        if (strE == null) {
            throw new NullPointerException("Null localEntityKey");
        }
        this.b = strE;
        if (this.d == 1 && (str = this.a) != null && (obj = this.g) != null && strE != null && (obj2 = this.f) != null && (obj3 = this.e) != null) {
            return new jla(str, this.c, (ajwo) obj, strE, (aiqd) obj2, (aiqd) obj3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" label");
        }
        if (this.d == 0) {
            sb.append(" isSelected");
        }
        if (this.g == null) {
            sb.append(" selectedCommand");
        }
        if (this.b == null) {
            sb.append(" localEntityKey");
        }
        if (this.f == null) {
            sb.append(" selectedAccessibilityData");
        }
        if (this.e == null) {
            sb.append(" deselectedAccessibilityData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(aiqd aiqdVar) {
        if (aiqdVar == null) {
            throw new NullPointerException("Null deselectedAccessibilityData");
        }
        this.e = aiqdVar;
    }

    public final void h(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.a = str;
    }

    public final void j(aiqd aiqdVar) {
        if (aiqdVar == null) {
            throw new NullPointerException("Null selectedAccessibilityData");
        }
        this.f = aiqdVar;
    }

    public final void k(ajwo ajwoVar) {
        if (ajwoVar == null) {
            throw new NullPointerException("Null selectedCommand");
        }
        this.g = ajwoVar;
    }
}
