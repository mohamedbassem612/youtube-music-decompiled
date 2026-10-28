package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wzm implements zza {
    final /* synthetic */ wzn a;

    public wzm(wzn wznVar) {
        this.a = wznVar;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i;
        anga angaVar;
        alrq alrqVar = (alrq) obj;
        wzn wznVar = this.a;
        if (wznVar.isVisible() && wznVar.q != null) {
            alrr alrrVar = alrqVar.c;
            if (alrrVar == null) {
                alrrVar = alrr.a;
            }
            if ((alrrVar.b == 66439850 ? (anfy) alrrVar.c : anfy.a).c.size() != 0) {
                alrr alrrVar2 = alrqVar.c;
                if (alrrVar2 == null) {
                    alrrVar2 = alrr.a;
                }
                anfy anfyVar = alrrVar2.b == 66439850 ? (anfy) alrrVar2.c : anfy.a;
                wznVar.r.setVisibility(8);
                wznVar.t.setVisibility(8);
                wznVar.s.setVisibility(0);
                wznVar.s.removeAllViews();
                LayoutInflater layoutInflater = wznVar.q.getLayoutInflater();
                ange angeVar = anfyVar.f;
                if (angeVar == null) {
                    angeVar = ange.a;
                }
                if (((angeVar.b == 82258301 ? (angd) angeVar.c : angd.a).b & 1) != 0) {
                    YouTubeTextView youTubeTextView = wznVar.t;
                    ange angeVar2 = anfyVar.f;
                    if (angeVar2 == null) {
                        angeVar2 = ange.a;
                    }
                    alay alayVar = (angeVar2.b == 82258301 ? (angd) angeVar2.c : angd.a).c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    youTubeTextView.setText(ackj.k(null, alayVar, null, false));
                    wznVar.t.setVisibility(0);
                    wznVar.u.setVisibility(0);
                }
                for (anfv anfvVar : anfyVar.c) {
                    View viewInflate = layoutInflater.inflate(R.layout.live_chat_context_menu_item, (ViewGroup) wznVar.s, false);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.label);
                    ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.icon);
                    View viewFindViewById = viewInflate.findViewById(R.id.separator);
                    textView.setText(yno.dV(anfvVar));
                    if (yno.dU(anfvVar) != null) {
                        aliz alizVarA = aliz.a(yno.dU(anfvVar).c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                        if (wznVar.m.a(alizVarA) != 0) {
                            imageButton.setImageDrawable(wznVar.q.getDrawable(wznVar.m.a(alizVarA)));
                        }
                    }
                    int i2 = anfvVar.b;
                    if (i2 != 66441108) {
                        i = anfvVar.b;
                        if (i == 66441155) {
                            if (i == 66441155) {
                                angaVar = (anga) anfvVar.c;
                            } else {
                                angaVar = anga.a;
                            }
                            if (angaVar.h) {
                                viewFindViewById.setVisibility(0);
                            }
                        }
                        viewFindViewById.setVisibility(8);
                    } else if ((i2 == 66441108 ? (anfw) anfvVar.c : anfw.a).i) {
                        viewFindViewById.setVisibility(0);
                    } else {
                        i = anfvVar.b;
                        if (i == 66441155) {
                            if (i == 66441155) {
                                angaVar = (anga) anfvVar.c;
                            } else {
                                angaVar = anga.a;
                            }
                            if (angaVar.h) {
                                viewFindViewById.setVisibility(0);
                            }
                        }
                        viewFindViewById.setVisibility(8);
                    }
                    if (yno.dW(anfvVar) == 2) {
                        viewInflate.setEnabled(false);
                        textView.setEnabled(false);
                        imageButton.setEnabled(false);
                    }
                    if (yno.dS(anfvVar) != null || yno.dT(anfvVar) != null) {
                        viewInflate.setOnClickListener(new vqd((Object) wznVar, (aihn) anfvVar, 2));
                    } else if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & SemanticState.Focused) != 0) {
                        viewInflate.setOnClickListener(new vqd((Object) wznVar, (aihn) anfvVar, 2));
                    }
                    wznVar.s.addView(viewInflate);
                }
                return;
            }
        }
        wznVar.dismiss();
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.a.dismiss();
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
