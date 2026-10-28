package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwq extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/QueueAddEndpointCommandResolver");
    private final Context b;
    private final ico c;
    private final awmd d;
    private final awmd e;
    private final aunn f;
    private final Executor g;
    private final hfn h;

    public gwq(Context context, ico icoVar, awmd awmdVar, hfn hfnVar, awmd awmdVar2, aunn aunnVar, Executor executor) {
        this.b = context;
        this.c = icoVar;
        this.d = awmdVar;
        this.h = hfnVar;
        this.e = awmdVar2;
        this.f = aunnVar;
        this.g = executor;
    }

    private final void e(apcb apcbVar) {
        if (apcbVar.g.size() > 0) {
            ((vxe) this.d.io()).b(apcbVar.g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        apcd apcdVar;
        int i;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apcb apcbVar = (apcb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        boolean zK = true;
        aoun aounVar = null;
        aounVar = null;
        if ((apcbVar.c & 1) != 0) {
            apcd apcdVar2 = apcbVar.d;
            if (apcdVar2 == null) {
                apcdVar2 = apcd.a;
            }
            apcdVar = apcdVar2;
        } else {
            apcdVar = null;
        }
        apcdVar.getClass();
        ico icoVar = this.c;
        if (icoVar.i()) {
            ((vxe) this.d.io()).a(fhz.P(this.b.getString(R.string.sideloaded_error_mixed_queue_tracks)));
            return;
        }
        if (icoVar.h()) {
            e(apcbVar);
            HashMap map2 = new HashMap();
            Boolean bool = Boolean.TRUE;
            map2.put("watch_start_paused", bool);
            map2.put("watch_mode_miniplayer", bool);
            if (apcdVar.e) {
                taf.i(ahno.ar(((hpy) this.e.io()).a(kro.aH(apcdVar.c)), new cbs(12), MoreExecutors.directExecutor()), this.g, new gwc(this, apcdVar, map2, 2, null), new gsu(this, apcdVar, map2, 5), null);
                return;
            }
            ajwo ajwoVar2 = ajwo.a;
            aihh aihhVar = (aihh) ajwoVar2.createBuilder();
            aihf aihfVarCreateBuilder = arij.a.createBuilder();
            String str = apcdVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar = (arij) aihfVarCreateBuilder.instance;
            str.getClass();
            arijVar.b |= 1;
            arijVar.d = str;
            String str2 = apcdVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar2 = (arij) aihfVarCreateBuilder.instance;
            str2.getClass();
            arijVar2.b |= 2;
            arijVar2.e = str2;
            aihhVar.e(arik.a, (arij) aihfVarCreateBuilder.build());
            vxe vxeVar = (vxe) this.d.io();
            if ((apcdVar.b & 8) != 0) {
                ajwo ajwoVar3 = apcdVar.f;
                if (ajwoVar3 != null) {
                    ajwoVar2 = ajwoVar3;
                }
            } else {
                ajwoVar2 = (ajwo) aihhVar.build();
            }
            vxeVar.c(ajwoVar2, map2);
            return;
        }
        if (((ycp) this.f.io()).e == null) {
            e(apcbVar);
            if (map != null) {
                Object obj = map.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (obj instanceof aoun) {
                    aounVar = (aoun) obj;
                }
            }
            if (aounVar != null) {
                String str3 = aounVar.n;
                apcd apcdVar3 = apcbVar.d;
                if (apcdVar3 == null) {
                    apcdVar3 = apcd.a;
                }
                if (str3.equals(apcdVar3.c)) {
                    hzf hzfVarS = this.h.s(aounVar);
                    apcc apccVarA = apcc.a(apcbVar.f);
                    if (apccVarA == null) {
                        apccVarA = apcc.MODE_UNSPECIFIED;
                    }
                    zK = icoVar.k(hzfVarS, apccVarA);
                }
            }
            icoVar.c(ajwoVar);
        }
        String str4 = apcdVar.c;
        if (!str4.isEmpty()) {
            List listO = icoVar.c.o(0);
            i = 0;
            while (true) {
                if (i >= listO.size()) {
                    i = -1;
                    break;
                } else if (((hyz) listO.get(i)).t().equals(str4)) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            i = -1;
            break;
        }
        apcc apccVarA2 = apcc.a(apcbVar.f);
        if (apccVarA2 == null) {
            apccVarA2 = apcc.MODE_UNSPECIFIED;
        }
        int iA = icoVar.a(apccVarA2, i);
        if (iA == -1 || i == -1) {
            zK = false;
        } else {
            abjp abjpVar = icoVar.c;
            if (i == abjpVar.a() || apccVarA2 != apcc.INSERT_AFTER_CURRENT_VIDEO) {
                zK = false;
            } else {
                abjpVar.d(0).j(i, iA);
                ((aczl) icoVar.g.io()).z((abkg) abjpVar.d(0).get(iA), iA > 0 ? (abkg) abjpVar.d(0).get(iA - 1) : null);
            }
        }
        if (zK) {
            ((agrc) ((agrc) a.c().i(agso.a, "QueueAddEndpointCmd")).k("com/google/android/apps/youtube/music/command/QueueAddEndpointCommandResolver", "resolve", 110, "QueueAddEndpointCommandResolver.java")).t("Move performed instead of add while casting.");
            e(apcbVar);
            return;
        } else if (i != -1) {
            ((agrc) ((agrc) a.c().i(agso.a, "QueueAddEndpointCmd")).k("com/google/android/apps/youtube/music/command/QueueAddEndpointCommandResolver", "resolve", 116, "QueueAddEndpointCommandResolver.java")).t("Returning early instead of enqueueing a duplicate video id while casting.");
            ((vxe) this.d.io()).a(fhz.P(this.b.getString(R.string.duplicate_track_error_mdx)));
            return;
        }
        if (zK) {
            return;
        }
        icoVar.c(ajwoVar);
    }

    public final void d(apcd apcdVar, Map map, boolean z) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        ias iasVarG = hna.g();
        iasVarG.a = apcdVar.c;
        iasVarG.b = apcdVar.d;
        iasVarG.f(z);
        aihhVar.e(aohu.a, iasVarG.c());
        ((vxe) this.d.io()).c((ajwo) aihhVar.build(), map);
    }
}
