package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swv extends admr {
    public final adhv a;
    public final vxe b;
    public final FrameLayout c;
    public final Context d;
    swu e;
    swu f;
    swu g;
    final int h;
    public final afip i;
    private final adsz j;

    public swv(Context context, adhv adhvVar, vxe vxeVar, afip afipVar, lqa lqaVar) {
        adhvVar.getClass();
        this.a = adhvVar;
        vxeVar.getClass();
        this.b = vxeVar;
        this.d = context;
        this.i = afipVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        int i = tzk.i(context, R.attr.ytCallToAction);
        this.h = i;
        adsy adsyVar = (adsy) lqaVar.a;
        adsyVar.e(-1);
        adsyVar.d(i);
        adsyVar.c();
        this.j = adsyVar.a();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x01f4  */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        aqtj aqtjVar;
        swu swuVar;
        ajnf ajnfVar;
        aqmh aqmhVarB;
        aqmh aqmhVarB2;
        alay alayVar;
        ajkx ajkxVar;
        CharSequence charSequenceConcat;
        arpn arpnVar;
        aqmj aqmjVar;
        aqmj aqmjVar2;
        aqto aqtoVar = (aqto) obj;
        aqtk aqtkVar = aqtoVar.j;
        if (aqtkVar == null) {
            aqtkVar = aqtk.a;
        }
        boolean z = true;
        if ((aqtkVar.b & 1) != 0) {
            aqtk aqtkVar2 = aqtoVar.j;
            if (aqtkVar2 == null) {
                aqtkVar2 = aqtk.a;
            }
            aqtjVar = aqtkVar2.c;
            if (aqtjVar == null) {
                aqtjVar = aqtj.a;
            }
        } else {
            aqtjVar = null;
        }
        if (aqtjVar == null) {
            swuVar = this.e;
            if (swuVar == null) {
                swuVar = new swu(this, 0);
                this.e = swuVar;
            }
        } else if (nsh.i(this.d.getResources().getConfiguration().orientation)) {
            swuVar = this.f;
            if (swuVar == null) {
                swuVar = new swu(this, 2);
                this.f = swuVar;
            }
        } else {
            swuVar = this.g;
            if (swuVar == null) {
                swuVar = new swu(this, 1);
                this.g = swuVar;
            }
        }
        xgn xgnVar = adlyVar.b;
        aeaa aeaaVar = swuVar.j;
        aeaaVar.c();
        if ((aqtoVar.b & SemanticState.Hidden) != 0) {
            ajng ajngVar = aqtoVar.i;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            ajnfVar = ajngVar.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        aeaaVar.a(ajnfVar, xgnVar, null);
        int i = swuVar.i;
        if (i != 0) {
            aqtk aqtkVar3 = aqtoVar.j;
            if (aqtkVar3 == null) {
                aqtkVar3 = aqtk.a;
            }
            aqtj aqtjVar2 = aqtkVar3.c;
            if (aqtjVar2 == null) {
                aqtjVar2 = aqtj.a;
            }
            if (twm.v(swuVar.l.d)) {
                aqmjVar2 = aqtjVar2.e;
                if (aqmjVar2 == null) {
                    aqmjVar2 = aqmj.a;
                }
            } else {
                aqmjVar2 = aqtjVar2.d;
                if (aqmjVar2 == null) {
                    aqmjVar2 = aqmj.a;
                }
            }
            aqmhVarB = swu.b(aqmjVar2, i == 2);
        } else if ((aqtoVar.b & 1) != 0) {
            aqmhVarB = aqtoVar.c;
            if (aqmhVarB == null) {
                aqmhVarB = aqmh.a;
            }
        } else {
            aqmhVarB = null;
        }
        swuVar.a(swuVar.b, aqmhVarB);
        if (i != 0) {
            aqtk aqtkVar4 = aqtoVar.j;
            if (aqtkVar4 == null) {
                aqtkVar4 = aqtk.a;
            }
            aqtj aqtjVar3 = aqtkVar4.c;
            if (aqtjVar3 == null) {
                aqtjVar3 = aqtj.a;
            }
            if ((aqtjVar3.b & 4) != 0) {
                aqmjVar = aqtjVar3.f;
                if (aqmjVar == null) {
                    aqmjVar = aqmj.a;
                }
            } else {
                aqmjVar = null;
            }
            aqmhVarB2 = swu.b(aqmjVar, i == 2);
        } else if ((aqtoVar.b & 2) != 0) {
            aqmhVarB2 = aqtoVar.d;
            if (aqmhVarB2 == null) {
                aqmhVarB2 = aqmh.a;
            }
        } else {
            aqmhVarB2 = null;
        }
        ImageView imageView = swuVar.c;
        swuVar.a(imageView, aqmhVarB2);
        if (aqmhVarB2 != null && (aqmhVarB2.b & 8) != 0) {
            aiqe aiqeVar = aqmhVarB2.e;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = aqmhVarB2.e;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                imageView.setContentDescription(aiqdVar.c);
            }
        }
        if (i != 0) {
            aqtk aqtkVar5 = aqtoVar.j;
            if (aqtkVar5 == null) {
                aqtkVar5 = aqtk.a;
            }
            aqtj aqtjVar4 = aqtkVar5.c;
            if (aqtjVar4 == null) {
                aqtjVar4 = aqtj.a;
            }
            if (aqtjVar4.c.size() == 0) {
                tuk.l(swuVar.f, false);
            } else {
                if (aqtjVar4.c.size() == 1) {
                    if (swuVar.k == null) {
                        swuVar.k = new int[2];
                    }
                    int[] iArr = swuVar.k;
                    int iD = aqtjVar4.c.d(0);
                    iArr[1] = iD;
                    iArr[0] = iD;
                    swuVar.m.f(swuVar.k);
                } else {
                    swuVar.m.f(ahng.S(aqtjVar4.c));
                }
                tuk.l(swuVar.f, true);
            }
        }
        adsz adszVar = this.j;
        TextView textView = swuVar.a;
        if ((aqtoVar.b & 16) != 0) {
            alayVar = aqtoVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        swv swvVar = swuVar.l;
        vxe vxeVar = swvVar.b;
        tuk.u(textView, vxl.a(null, alayVar, vxeVar, false));
        if ((aqtoVar.b & 4) != 0) {
            aqtn aqtnVar = aqtoVar.e;
            if (aqtnVar == null) {
                aqtnVar = aqtn.a;
            }
            ajkxVar = aqtnVar.b == 118483990 ? (ajkx) aqtnVar.c : ajkx.a;
        } else {
            ajkxVar = null;
        }
        adsy adsyVar = new adsy(adszVar);
        adsyVar.b = textView;
        adsyVar.c = (aqtoVar.b & 1) != 0 ? null : swvVar.c;
        adsyVar.a().a(ajkxVar);
        TextView textView2 = swuVar.e;
        alay[] alayVarArr = (alay[]) aqtoVar.g.toArray(new alay[0]);
        if (alayVarArr != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < alayVarArr.length) {
                alay alayVar2 = alayVarArr[i2];
                if (!z) {
                    arrayList.add(" • ");
                }
                arrayList.add(vxl.a(null, alayVar2, vxeVar, false));
                i2++;
                z = false;
            }
            if (arrayList.isEmpty()) {
                charSequenceConcat = null;
            } else {
                charSequenceConcat = TextUtils.concat((CharSequence[]) arrayList.toArray(new CharSequence[0]));
            }
        } else {
            charSequenceConcat = null;
        }
        tuk.u(textView2, charSequenceConcat);
        if ((aqtoVar.b & SemanticState.Focused) != 0) {
            arpo arpoVar = aqtoVar.h;
            if (arpoVar == null) {
                arpoVar = arpo.a;
            }
            arpnVar = arpoVar.c;
            if (arpnVar == null) {
                arpnVar = arpn.a;
            }
        } else {
            arpnVar = null;
        }
        TextView textView3 = swuVar.h;
        if (textView3 != null) {
            if (arpnVar != null) {
                alay alayVar3 = arpnVar.b;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                tuk.u(textView3, ackj.k(null, alayVar3, null, false));
            } else {
                textView3.setVisibility(8);
            }
        }
        FrameLayout frameLayout = this.c;
        frameLayout.removeAllViews();
        frameLayout.addView(swuVar.g);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqto) obj).k.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
