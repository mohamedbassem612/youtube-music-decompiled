package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guw extends gut {
    private final izr a;
    private final ijt b;
    private final abfv c;

    public guw(ijt ijtVar, izr izrVar, abfv abfvVar) {
        this.b = ijtVar;
        this.a = izrVar;
        this.c = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aevy aevyVar = (aevy) ((cf) this.b.a).getSupportFragmentManager().g("MUSIC_MULTISELECT_MENU_BOTTOM_SHEET_FRAGMENT_TAG");
        if (aevyVar != null) {
            aevyVar.dismiss();
        }
        this.a.i();
        this.c.n();
    }
}
