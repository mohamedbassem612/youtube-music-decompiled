package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ablt implements abhp, ablw {
    private boolean a;
    public final View c;
    public final ablx d;

    public ablt(ScrubbedPreviewView scrubbedPreviewView, ablx ablxVar) {
        this.c = scrubbedPreviewView;
        this.d = ablxVar;
        ablxVar.b(this);
    }

    private final void a(ably ablyVar) {
        boolean z = this.a;
        View view = this.c;
        if (!z) {
            ((ScrubbedPreviewView) view).a();
            return;
        }
        ScrubbedPreviewView scrubbedPreviewView = (ScrubbedPreviewView) view;
        if (!scrubbedPreviewView.e) {
            if (scrubbedPreviewView.c.isStarted()) {
                scrubbedPreviewView.c.reverse();
            } else {
                scrubbedPreviewView.c.start();
            }
            scrubbedPreviewView.e = true;
        }
        scrubbedPreviewView.a.setImageBitmap(ablyVar != null ? ablyVar.a : null);
    }

    public final void b(boolean z) {
        ably ablyVarA;
        if (this.a != z) {
            this.a = z;
            ablx ablxVar = this.d;
            synchronized (ablxVar.l) {
                Bitmap bitmap = ablxVar.i;
                ablyVarA = bitmap != null ? ably.a(bitmap) : null;
            }
            a(ablyVarA);
        }
    }

    public final boolean c() {
        return this.d.e();
    }

    @Override // defpackage.ablw
    public final void e(ably ablyVar) {
        a(ablyVar);
    }

    @Override // defpackage.abhp
    public void f(int i, long j) {
        throw null;
    }

    @Override // defpackage.ablw
    public final /* synthetic */ void d() {
    }
}
