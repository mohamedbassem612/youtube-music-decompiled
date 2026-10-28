package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ic extends bak {
    final /* synthetic */ id a;
    private boolean b = false;
    private int c = 0;

    public ic(id idVar) {
        this.a = idVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        int i = this.c + 1;
        this.c = i;
        id idVar = this.a;
        if (i == idVar.a.size()) {
            baj bajVar = idVar.b;
            if (bajVar != null) {
                bajVar.a(null);
            }
            this.c = 0;
            this.b = false;
            idVar.c = false;
        }
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        baj bajVar = this.a.b;
        if (bajVar != null) {
            bajVar.b();
        }
    }
}
