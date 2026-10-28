package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jge implements adma {
    public final Context a;
    public final SwitchCompat b;
    public AlertDialog c;
    public final jlh d;
    public boolean e;
    public final abfv f;
    private final vxe g;
    private final tbt h;
    private final View i;
    private final TextView j;
    private final RecyclerView k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final jbm o;
    private final View p;
    private final TextView q;
    private final TextView r;
    private final jbm s;
    private final TextView t;
    private final jbm u;
    private final admu v;
    private aovg w;
    private adly x;

    public jge(Context context, vxe vxeVar, tbt tbtVar, ahek ahekVar, jij jijVar, jer jerVar, abfv abfvVar, jlh jlhVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.playlist_settings_editor_collaboration_section, (ViewGroup) null, false);
        this.i = viewInflate;
        this.a = context;
        this.g = vxeVar;
        this.h = tbtVar;
        this.f = abfvVar;
        this.d = jlhVar;
        SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(R.id.collaboration_state_switch);
        this.b = switchCompat;
        switchCompat.setTypeface(ackm.ROBOTO_MEDIUM.c(context, 0));
        this.j = (TextView) viewInflate.findViewById(R.id.empty_collaborators_text);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.collaborators_avatars);
        this.k = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.ah(linearLayoutManager);
        admo admoVarD = ahekVar.d(jerVar.a);
        admu admuVar = new admu();
        this.v = admuVar;
        admoVarD.D(admuVar, null);
        recyclerView.ad(admoVarD);
        this.l = viewInflate.findViewById(R.id.get_link_section);
        this.m = (TextView) viewInflate.findViewById(R.id.get_link_description);
        TextView textView = (TextView) viewInflate.findViewById(R.id.get_link_button);
        this.n = textView;
        this.o = jijVar.a(textView, null, new ivp(this, 18), null, false);
        this.p = viewInflate.findViewById(R.id.link_sharing_section);
        this.q = (TextView) viewInflate.findViewById(R.id.invite_link);
        this.r = (TextView) viewInflate.findViewById(R.id.share_link_description);
        this.s = jijVar.a((TextView) viewInflate.findViewById(R.id.share_link_button), null, null, null, false);
        this.t = (TextView) viewInflate.findViewById(R.id.revoke_links_description);
        this.u = jijVar.a((TextView) viewInflate.findViewById(R.id.revoke_links_button), null, new ivp(this, 19), null, false);
        tbtVar.f(this);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.i;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.h.l(this);
        this.w = null;
        this.x = null;
    }

    public final void d(boolean z) {
        aovg aovgVar = this.w;
        if (aovgVar != null) {
            aova aovaVar = aovgVar.c;
            if (aovaVar == null) {
                aovaVar = aova.a;
            }
            ajwo ajwoVar = aovaVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aihf builder = ((aotf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
            for (int i = 0; i < ((aotf) builder.instance).e.size(); i++) {
                aote aoteVar = (aote) ((aotf) builder.instance).e.get(i);
                aotd aotdVarA = aotd.a(aoteVar.d);
                if (aotdVarA == null) {
                    aotdVarA = aotd.ACTION_UNKNOWN;
                }
                if (aotdVarA == aotd.ACTION_SET_CLOSED_TO_CONTRIBUTIONS) {
                    aihf builder2 = aoteVar.toBuilder();
                    builder2.copyOnWrite();
                    aote aoteVar2 = (aote) builder2.instance;
                    aoteVar2.b |= 268435456;
                    aoteVar2.n = !z;
                    aote aoteVar3 = (aote) builder2.build();
                    builder.copyOnWrite();
                    aotf aotfVar = (aotf) builder.instance;
                    aoteVar3.getClass();
                    aotfVar.a();
                    aotfVar.e.set(i, aoteVar3);
                    break;
                }
            }
            aihf builder3 = this.w.toBuilder();
            aova aovaVar2 = this.w.c;
            if (aovaVar2 == null) {
                aovaVar2 = aova.a;
            }
            aihf builder4 = aovaVar2.toBuilder();
            aova aovaVar3 = this.w.c;
            if (aovaVar3 == null) {
                aovaVar3 = aova.a;
            }
            ajwo ajwoVar2 = aovaVar3.e;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihh aihhVar = (aihh) ajwoVar2.toBuilder();
            aihhVar.e(aotf.b, (aotf) builder.build());
            builder4.copyOnWrite();
            aova aovaVar4 = (aova) builder4.instance;
            ajwo ajwoVar3 = (ajwo) aihhVar.build();
            ajwoVar3.getClass();
            aovaVar4.e = ajwoVar3;
            aovaVar4.b |= 8;
            builder3.copyOnWrite();
            aovg aovgVar2 = (aovg) builder3.instance;
            aova aovaVar5 = (aova) builder4.build();
            aovaVar5.getClass();
            aovgVar2.c = aovaVar5;
            aovgVar2.b |= 2;
            this.w = (aovg) builder3.build();
            this.b.setEnabled(false);
            vxe vxeVar = this.g;
            aova aovaVar6 = this.w.c;
            if (aovaVar6 == null) {
                aovaVar6 = aova.a;
            }
            ajwo ajwoVar4 = aovaVar6.e;
            if (ajwoVar4 == null) {
                ajwoVar4 = ajwo.a;
            }
            vxeVar.c(ajwoVar4, null);
        }
    }

    public final void e() {
        if (this.w != null) {
            f(3);
            this.q.setText(this.a.getString(R.string.collab_playlist_link_loading));
        }
    }

    public final void f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.p.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        View view = this.p;
        if (i2 != 1) {
            view.setVisibility(0);
            this.l.setVisibility(8);
        } else {
            view.setVisibility(8);
            this.l.setVisibility(0);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        aovg aovgVar;
        aovg aovgVar2 = (aovg) obj;
        this.x = adlyVar;
        this.w = aovgVar2;
        xgn xgnVar = adlyVar.b;
        byte[] bArr = null;
        if (xgnVar != null) {
            xgnVar.w(new xgj(xhb.b(99282)), null);
        }
        this.i.setVisibility(0);
        aova aovaVar = aovgVar2.c;
        if (aovaVar == null) {
            aovaVar = aova.a;
        }
        SwitchCompat switchCompat = this.b;
        if ((aovaVar.b & 2) != 0) {
            alayVar = aovaVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        switchCompat.setText(ackj.k(null, alayVar, null, false));
        boolean z = !aovaVar.d;
        this.e = z;
        switchCompat.setChecked(z);
        if (!this.e || (aovgVar = this.w) == null) {
            f(1);
        } else {
            f(true != aovgVar.j ? 2 : 3);
        }
        switchCompat.setOnCheckedChangeListener(new dlm(this, 4, bArr));
        aovb aovbVar = aovgVar2.d;
        if (aovbVar == null) {
            aovbVar = aovb.a;
        }
        TextView textView = this.j;
        if ((aovbVar.b & 2) != 0) {
            alayVar2 = aovbVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        textView.setText(ackj.k(null, alayVar2, null, false));
        if (aovbVar.c.size() == 0) {
            textView.setVisibility(0);
            this.k.setVisibility(8);
        } else {
            admu admuVar = this.v;
            admuVar.clear();
            admuVar.addAll(aovbVar.c);
            textView.setVisibility(8);
            this.k.setVisibility(0);
        }
        TextView textView2 = this.m;
        if ((aovgVar2.b & SemanticState.Focused) != 0) {
            alayVar3 = aovgVar2.e;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        textView2.setText(ackj.k(null, alayVar3, null, false));
        jbm jbmVar = this.o;
        aove aoveVar = aovgVar2.f;
        if (aoveVar == null) {
            aoveVar = aove.a;
        }
        ajnf ajnfVar = aoveVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        jbmVar.j(adlyVar, ajnfVar, 27);
        TextView textView3 = this.r;
        alay alayVar5 = aovgVar2.k;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar5, null, false));
        jbm jbmVar2 = this.s;
        aove aoveVar2 = aovgVar2.h;
        if (aoveVar2 == null) {
            aoveVar2 = aove.a;
        }
        ajnf ajnfVar2 = aoveVar2.c;
        if (ajnfVar2 == null) {
            ajnfVar2 = ajnf.a;
        }
        jbmVar2.hU(adlyVar, ajnfVar2);
        TextView textView4 = this.t;
        if ((aovgVar2.b & SemanticState.LiveRegion) != 0) {
            alayVar4 = aovgVar2.g;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
        } else {
            alayVar4 = null;
        }
        textView4.setText(ackj.k(null, alayVar4, null, false));
        jbm jbmVar3 = this.u;
        aove aoveVar3 = aovgVar2.i;
        if (aoveVar3 == null) {
            aoveVar3 = aove.a;
        }
        ajnf ajnfVar3 = aoveVar3.c;
        if (ajnfVar3 == null) {
            ajnfVar3 = ajnf.a;
        }
        jbmVar3.j(adlyVar, ajnfVar3, 35);
        aova aovaVar2 = aovgVar2.c;
        if (aovaVar2 == null) {
            aovaVar2 = aova.a;
        }
        if (aovaVar2.d || !aovgVar2.j) {
            return;
        }
        this.n.performClick();
    }

    @tcc
    public void handleCreateCollaborationInviteLinkEvent(wsm wsmVar) {
        if (!wsmVar.b || this.w == null || this.x == null) {
            f(2);
            return;
        }
        TextView textView = this.q;
        String str = wsmVar.a;
        textView.setText(str);
        aove aoveVar = this.w.h;
        if (aoveVar == null) {
            aoveVar = aove.a;
        }
        ajnf ajnfVar = aoveVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        ajwo ajwoVar = ajnfVar.r;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apth.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apth.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aihf builder = ((apth) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
            builder.copyOnWrite();
            apth apthVar = (apth) builder.instance;
            apthVar.c |= 2;
            apthVar.d = str;
            apth apthVar2 = (apth) builder.build();
            aove aoveVar2 = this.w.h;
            if (aoveVar2 == null) {
                aoveVar2 = aove.a;
            }
            ajnf ajnfVar2 = aoveVar2.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
            aihh aihhVar = (aihh) ajnfVar2.toBuilder();
            aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
            aihhVar2.e(apth.b, apthVar2);
            aihhVar.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar.instance;
            ajwo ajwoVar2 = (ajwo) aihhVar2.build();
            ajwoVar2.getClass();
            ajnfVar3.r = ajwoVar2;
            ajnfVar3.b |= SemanticState.Obscured;
            ajnf ajnfVar4 = (ajnf) aihhVar.build();
            this.s.hU(this.x, ajnfVar4);
            aihf builder2 = this.w.toBuilder();
            aove aoveVar3 = this.w.h;
            if (aoveVar3 == null) {
                aoveVar3 = aove.a;
            }
            aihf builder3 = aoveVar3.toBuilder();
            builder3.copyOnWrite();
            aove aoveVar4 = (aove) builder3.instance;
            ajnfVar4.getClass();
            aoveVar4.c = ajnfVar4;
            aoveVar4.b |= 1;
            builder2.copyOnWrite();
            aovg aovgVar = (aovg) builder2.instance;
            aove aoveVar5 = (aove) builder3.build();
            aoveVar5.getClass();
            aovgVar.h = aoveVar5;
            aovgVar.b |= SemanticState.ReadOnly;
            this.w = (aovg) builder2.build();
        }
    }

    @tcc
    public void handlePlaylistClosedToContributionsEvent(wsn wsnVar) {
        if (wsnVar.b) {
            boolean z = wsnVar.a;
            this.e = !z;
            if (!z) {
                aovg aovgVar = this.w;
                if (aovgVar != null) {
                    vxe vxeVar = this.g;
                    aove aoveVar = aovgVar.f;
                    if (aoveVar == null) {
                        aoveVar = aove.a;
                    }
                    ajnf ajnfVar = aoveVar.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    ajwo ajwoVar = ajnfVar.q;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                }
                e();
            }
        } else {
            this.b.setChecked(this.e);
        }
        this.b.setEnabled(true);
    }

    @tcc
    public void handleRevokeCollaborationTokensEvent(wsq wsqVar) {
        if (wsqVar.a) {
            return;
        }
        f(3);
    }
}
