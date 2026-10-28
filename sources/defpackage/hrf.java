package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hrf extends aatw {
    private hre e;
    private final abfv f;
    private final ci g;

    public hrf(Activity activity, aduv aduvVar, vxe vxeVar, adhv adhvVar, ci ciVar, abfv abfvVar) {
        super(activity, aduvVar, vxeVar, adhvVar);
        this.g = ciVar;
        this.f = abfvVar;
    }

    @Override // defpackage.aatw
    protected final void a() {
        this.d = new hrd(this.a, c(), this.b, this.c);
    }

    @Override // defpackage.aatw, defpackage.aaug
    public final void b(Object obj, xgn xgnVar, Pair pair) {
        xgn xgnVar2;
        TextView textView;
        Pair pair2 = pair;
        if (obj != null) {
            boolean z = false;
            if (obj instanceof arat) {
                arat aratVar = (arat) obj;
                if ((aratVar.b & 4194304) == 0) {
                    d(aratVar, xgnVar, null);
                    return;
                }
                if (aratVar.k) {
                    hre hreVar = this.e;
                    if (hreVar == null) {
                        hre hreVar2 = new hre(this.a, c(), this.b, this.c);
                        this.e = hreVar2;
                        hreVar = hreVar2;
                    }
                    Context context = hreVar.h;
                    hreVar.l = LayoutInflater.from(context).inflate(R.layout.upsell_dialog_straight_to_cc, (ViewGroup) null);
                    hreVar.m = (ImageView) hreVar.l.findViewById(R.id.background_image);
                    hreVar.n = (ImageView) hreVar.l.findViewById(R.id.logo);
                    adhv adhvVar = hreVar.k;
                    hreVar.o = new adia(adhvVar, hreVar.m, false);
                    hreVar.p = new adia(adhvVar, hreVar.n, false);
                    hreVar.q = (TextView) hreVar.l.findViewById(R.id.dialog_title);
                    hreVar.r = (TextView) hreVar.l.findViewById(R.id.dialog_message);
                    hreVar.b = (TextView) hreVar.l.findViewById(R.id.offer_title);
                    hreVar.c = (ImageView) hreVar.l.findViewById(R.id.expand_button);
                    hreVar.d = (LinearLayout) hreVar.l.findViewById(R.id.offer_title_container);
                    hreVar.e = (LinearLayout) hreVar.l.findViewById(R.id.offer_restrictions_container);
                    hreVar.a = (ScrollView) hreVar.l.findViewById(R.id.scroll_view);
                    hreVar.t = (TextView) hreVar.l.findViewById(R.id.action_button);
                    hreVar.u = (TextView) hreVar.l.findViewById(R.id.dismiss_button);
                    hreVar.s = hreVar.i.setView(hreVar.l).create();
                    hreVar.b(hreVar.s);
                    hreVar.g(aratVar, xgnVar);
                    hdf hdfVar = new hdf(hreVar, 3);
                    hreVar.f(aratVar, hdfVar);
                    aodl aodlVar = aratVar.l;
                    if (aodlVar == null) {
                        aodlVar = aodl.a;
                    }
                    if ((aodlVar.b & 1) != 0 && (textView = hreVar.b) != null && hreVar.c != null && hreVar.d != null && hreVar.e != null) {
                        aodl aodlVar2 = aratVar.l;
                        if (aodlVar2 == null) {
                            aodlVar2 = aodl.a;
                        }
                        aodk aodkVar = aodlVar2.c;
                        if (aodkVar == null) {
                            aodkVar = aodk.a;
                        }
                        alay alayVar = aodkVar.b;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        textView.setText(ackj.k(null, alayVar, null, false));
                        hreVar.f = false;
                        hreVar.c.setImageResource(R.drawable.yt_outline_chevron_down_black_24);
                        hreVar.d.setOnClickListener(hdfVar);
                        hreVar.e.removeAllViews();
                        hreVar.e.setVisibility(8);
                        int i = 0;
                        while (true) {
                            aodl aodlVar3 = aratVar.l;
                            if (aodlVar3 == null) {
                                aodlVar3 = aodl.a;
                            }
                            aodk aodkVar2 = aodlVar3.c;
                            if (aodkVar2 == null) {
                                aodkVar2 = aodk.a;
                            }
                            if (i >= aodkVar2.c.size()) {
                                break;
                            }
                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.upsell_dialog_straight_to_cc_restriction_row, (ViewGroup) null);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.offer_details_texts);
                            aodl aodlVar4 = aratVar.l;
                            if (aodlVar4 == null) {
                                aodlVar4 = aodl.a;
                            }
                            aodk aodkVar3 = aodlVar4.c;
                            if (aodkVar3 == null) {
                                aodkVar3 = aodk.a;
                            }
                            textView2.setText(vxl.a(null, (alay) aodkVar3.c.get(i), hreVar.j, false));
                            hreVar.e.addView(viewInflate);
                            i++;
                        }
                    }
                    hreVar.s.show();
                    hre.e(hreVar.j, aratVar);
                } else {
                    hre.e(this.b, aratVar);
                }
                if (xgnVar != null) {
                    xgnVar.w(new xgj(aratVar.i, (amud) null), null);
                    return;
                }
                return;
            }
            if (obj instanceof akdd) {
                akdd akddVar = (akdd) obj;
                if (xgnVar != null) {
                    if ((akddVar.b & 64) == 0) {
                        if (pair2 != null) {
                            z = true;
                        } else {
                            pair2 = null;
                        }
                    }
                    if (pair2 != null && z && pair2.first != null) {
                        String str = (String) pair2.first;
                        aihf builder = akddVar.toBuilder();
                        aihf aihfVarCreateBuilder = ajng.a.createBuilder();
                        aihh aihhVar = (aihh) ajnf.a.createBuilder();
                        alay alayVarC = ackj.c(str);
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar = (ajnf) aihhVar.instance;
                        alayVarC.getClass();
                        ajnfVar.m = alayVarC;
                        ajnfVar.b |= 64;
                        ajnf ajnfVar2 = (ajnf) aihhVar.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        ajng ajngVar = (ajng) aihfVarCreateBuilder.instance;
                        ajnfVar2.getClass();
                        ajngVar.c = ajnfVar2;
                        ajngVar.b |= 1;
                        ajng ajngVar2 = (ajng) aihfVarCreateBuilder.build();
                        builder.copyOnWrite();
                        akdd akddVar2 = (akdd) builder.instance;
                        ajngVar2.getClass();
                        akddVar2.g = ajngVar2;
                        akddVar2.b |= 64;
                        akddVar = (akdd) builder.build();
                    }
                    acwl.i(this.a, akddVar, this.b, xgnVar, null, true, true, new hrb(true == z ? pair2 : null, 1), null, null, null, this.f, false);
                    return;
                }
                xgnVar2 = null;
            } else {
                xgnVar2 = xgnVar;
            }
            if (obj instanceof akmh) {
                akmh akmhVar = (akmh) obj;
                if (xgnVar2 != null) {
                    ci ciVar = this.g;
                    aihf aihfVarCreateBuilder2 = akdd.a.createBuilder();
                    if ((akmhVar.b & 2) != 0) {
                        alay alayVarC2 = ackj.c(akmhVar.d);
                        aihfVarCreateBuilder2.copyOnWrite();
                        akdd akddVar3 = (akdd) aihfVarCreateBuilder2.instance;
                        alayVarC2.getClass();
                        akddVar3.c = alayVarC2;
                        akddVar3.b |= 1;
                    }
                    if ((akmhVar.b & 4) != 0) {
                        aihfVarCreateBuilder2.aR(ackj.c(akmhVar.e));
                    } else if (!akmhVar.f.isEmpty()) {
                        aiie aiieVar = akmhVar.f;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akdd akddVar4 = (akdd) aihfVarCreateBuilder2.instance;
                        akddVar4.a();
                        aifs.addAll(aiieVar, akddVar4.f);
                    }
                    alja aljaVar = akmhVar.c;
                    if (aljaVar == null) {
                        aljaVar = alja.a;
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    akdd akddVar5 = (akdd) aihfVarCreateBuilder2.instance;
                    aljaVar.getClass();
                    akddVar5.d = aljaVar;
                    akddVar5.b |= 16;
                    aigj aigjVar = akmhVar.h;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akdd akddVar6 = (akdd) aihfVarCreateBuilder2.instance;
                    aigjVar.getClass();
                    akddVar6.b |= 262144;
                    akddVar6.m = aigjVar;
                    aipe aipeVar = akmhVar.g;
                    if (aipeVar == null) {
                        aipeVar = aipe.a;
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    akdd akddVar7 = (akdd) aihfVarCreateBuilder2.instance;
                    aipeVar.getClass();
                    akddVar7.i = aipeVar;
                    akddVar7.b |= SemanticState.Modal;
                    ajng ajngVarAm = ci.am(((Context) ciVar.a).getResources().getText(R.string.dismiss).toString());
                    aihfVarCreateBuilder2.copyOnWrite();
                    akdd akddVar8 = (akdd) aihfVarCreateBuilder2.instance;
                    ajngVarAm.getClass();
                    akddVar8.h = ajngVarAm;
                    akddVar8.b |= SemanticState.Focused;
                    if (pair2 != null) {
                        ajng ajngVarAm2 = ci.am((String) pair2.first);
                        aihfVarCreateBuilder2.copyOnWrite();
                        akdd akddVar9 = (akdd) aihfVarCreateBuilder2.instance;
                        ajngVarAm2.getClass();
                        akddVar9.g = ajngVarAm2;
                        akddVar9.b |= 64;
                    } else {
                        pair2 = null;
                    }
                    acwl.i(this.a, (akdd) aihfVarCreateBuilder2.build(), this.b, xgnVar2, null, true, true, pair2 != null ? new hrb(pair2, 0) : new hrc(), null, null, null, this.f, false);
                    return;
                }
            }
            d(obj, xgnVar2, pair2);
        }
    }

    @Override // defpackage.aatw
    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        super.handleSignOutEvent(zwuVar);
    }
}
