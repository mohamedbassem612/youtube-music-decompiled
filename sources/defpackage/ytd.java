package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ytd extends zir {
    private final int b;
    private final int c;
    private int d;
    private boolean e;
    private final boolean f;
    private final tgr g;

    public ytd(tgr tgrVar, byw bywVar, int i, int i2, boolean z) {
        super(bywVar);
        this.b = i;
        this.c = i2;
        this.f = z;
        this.g = tgrVar;
        this.d = 0;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final long b(byi byiVar) throws byt {
        Uri uri = byiVar.a;
        if (uri.getBooleanQueryParameter("opf", false)) {
            this.e = true;
            this.d = this.b;
        } else if (uri.getBooleanQueryParameter("owc", false)) {
            this.d = this.c;
        }
        if (!this.f || this.e) {
            tgr tgrVar = this.g;
            tgrVar.d(this.d);
            try {
                tgrVar.e(this.d);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new byt(new IOException(e), byiVar, 2000, 1);
            }
        }
        return super.b(byiVar);
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final void f() {
        try {
            super.f();
        } finally {
            if (this.e || !this.f) {
                this.g.g(this.d);
                this.e = false;
            }
        }
    }
}
