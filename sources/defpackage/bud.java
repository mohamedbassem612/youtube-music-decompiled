package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bud {
    public buc a;
    public brq b;
    public int c;
    private final agfr e;
    private final Handler f;
    private bue h;
    public float d = 1.0f;
    private int g = 0;

    public bud(Context context, Looper looper, buc bucVar) {
        this.e = aguu.al(new cbr(context, 1));
        this.a = bucVar;
        this.f = new Handler(looper);
    }

    public final int a(boolean z, int i) {
        if (i == 1 || this.c != 1) {
            b();
            d(0);
        } else {
            int i2 = this.g;
            if (!z) {
                if (i2 != 1) {
                    if (i2 == 3) {
                        return 0;
                    }
                }
                return -1;
            }
            if (i2 != 2) {
                if (this.h == null) {
                    brq brqVar = brq.a;
                    boolean zE = e();
                    brq brqVar2 = this.b;
                    brqVar2.getClass();
                    this.h = new bue(new AudioManager.OnAudioFocusChangeListener() { // from class: bub
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i3) {
                            bud budVar = this.a;
                            if (i3 == -3 || i3 == -2) {
                                if (i3 != -2 && !budVar.e()) {
                                    budVar.d(4);
                                    return;
                                } else {
                                    budVar.c(0);
                                    budVar.d(3);
                                    return;
                                }
                            }
                            if (i3 == -1) {
                                budVar.c(-1);
                                budVar.b();
                                budVar.d(1);
                            } else if (i3 != 1) {
                                bvx.e("AudioFocusManager", a.bR(i3, "Unknown focus change type: "));
                            } else {
                                budVar.d(2);
                                budVar.c(1);
                            }
                        }
                    }, this.f, brqVar2, zE);
                }
                int iRequestAudioFocus = ((AudioManager) this.e.io()).requestAudioFocus(this.h.a());
                if (iRequestAudioFocus != 1 && iRequestAudioFocus != 2) {
                    d(1);
                    return -1;
                }
                d(2);
            }
        }
        return 1;
    }

    public final void b() {
        int i = this.g;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        ((AudioManager) this.e.io()).abandonAudioFocusRequest(this.h.a());
    }

    public final void c(int i) {
        buc bucVar = this.a;
        if (bucVar != null) {
            ((ccs) bucVar).e.l(33, i, 0).p();
        }
    }

    public final void d(int i) {
        if (this.g != i) {
            this.g = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.d != f) {
                this.d = f;
                buc bucVar = this.a;
                if (bucVar != null) {
                    ((ccs) bucVar).e.g(34);
                }
            }
        }
    }

    public final boolean e() {
        brq brqVar = this.b;
        return brqVar != null && brqVar.b == 1;
    }
}
