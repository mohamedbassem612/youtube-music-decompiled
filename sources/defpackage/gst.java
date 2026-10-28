package defpackage;

import android.os.Build;
import android.webkit.WebView;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gst implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gst(xyk xykVar, xvz xvzVar, String str, int i) {
        this.$cid = i;
        this.a = xykVar;
        this.c = xvzVar;
        this.d = str;
        this.b = "updateSignInStatus";
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0306 A[Catch: RuntimeException -> 0x031b, TryCatch #1 {RuntimeException -> 0x031b, blocks: (B:80:0x02db, B:82:0x02e4, B:83:0x0306, B:85:0x030f, B:87:0x0315), top: B:99:0x02db }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, zwa] */
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
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        WebView webView;
        int i = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                gsw gswVar = (gsw) this.a;
                if (gswVar.h.e != null) {
                    gswVar.g.l((xvi) this.d);
                } else {
                    Object obj2 = this.c;
                    gswVar.f.f((amyv) this.b);
                    gswVar.b.a((dii) obj2);
                }
                break;
            case 1:
                acjy acjyVar = (acjy) obj;
                gpo gpoVar = (gpo) this.a;
                if (gpoVar.e == this.d) {
                    Object obj3 = this.c;
                    this.b.a(acjyVar);
                    gpoVar.d.kk(obj3);
                    gpoVar.e = null;
                    if (gpo.e((gpm) obj3)) {
                        gpoVar.b.f(tau.BROWSE_RESPONSE_RECEIVED);
                    }
                }
                break;
            case 2:
                anqm anqmVar = (anqm) obj;
                boolean zEquals = anqmVar.equals(anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_LIST_ITEMS);
                Object obj4 = this.d;
                Object obj5 = this.a;
                if (zEquals) {
                    ajmv ajmvVar = ((ajmn) obj4).d;
                    if (ajmvVar == null) {
                        ajmvVar = ajmv.a;
                    }
                    aihf aihfVar = (aihf) obj5;
                    aihfVar.copyOnWrite();
                    ajmu ajmuVar = (ajmu) aihfVar.instance;
                    ajmu ajmuVar2 = ajmu.a;
                    ajmvVar.getClass();
                    ajmuVar.d = ajmvVar;
                    ajmuVar.c |= 1;
                } else if (anqmVar.equals(anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS)) {
                    ajmv ajmvVar2 = ((ajmn) obj4).e;
                    if (ajmvVar2 == null) {
                        ajmvVar2 = ajmv.a;
                    }
                    aihf aihfVar2 = (aihf) obj5;
                    aihfVar2.copyOnWrite();
                    ajmu ajmuVar3 = (ajmu) aihfVar2.instance;
                    ajmu ajmuVar4 = ajmu.a;
                    ajmvVar2.getClass();
                    ajmuVar3.d = ajmvVar2;
                    ajmuVar3.c |= 1;
                }
                aihf aihfVar3 = (aihf) obj5;
                if ((((ajmu) aihfVar3.instance).c & 1) != 0) {
                    ?? r11 = this.b;
                    Object obj6 = this.c;
                    aihh aihhVar = (aihh) ajwo.a.createBuilder();
                    aihhVar.e(ajmu.b, (ajmu) aihfVar3.build());
                    ((gsz) obj6).a.c((ajwo) aihhVar.build(), r11);
                }
                break;
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    ((gvy) this.c).d((aofx) this.a, (Optional) this.d, this.b);
                }
                break;
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    ((gwa) this.c).d((ajwo) this.a, (aoht) this.d, this.b);
                }
                break;
            case 5:
                aihh aihhVar2 = (aihh) ((aihn) this.d).toBuilder();
                aihl aihlVar = aohu.a;
                float fLongValue = ((Long) obj).longValue();
                aihf builder = ((aihn) this.b).toBuilder();
                builder.copyOnWrite();
                aoht aohtVar = (aoht) builder.instance;
                aohtVar.b |= 16;
                aohtVar.f = fLongValue;
                aihhVar2.e(aihlVar, (aoht) builder.build());
                ((gwa) this.c).a.s((ajwo) aihhVar2.build(), (hxb) this.a);
                break;
            case 6:
                alyk alykVar = (alyk) obj;
                Object obj7 = this.c;
                if (alykVar != null && alykVar.c.size() != 0) {
                    ((gyj) obj7).b.d(alykVar.c, this.b);
                }
                Object obj8 = this.a;
                ((gyj) obj7).c.kk(new gsk((String) this.d, true, true));
                if (obj8 != null) {
                    ((avpr) obj8).a();
                }
                break;
            case 7:
                alym alymVar = (alym) obj;
                int size = alymVar.c.size();
                Object obj9 = this.c;
                if (size != 0) {
                    ((gyl) obj9).b.d(alymVar.c, this.b);
                }
                Object obj10 = this.a;
                ((gyl) obj9).c.kk(new gsk((String) this.d, false, true));
                if (obj10 != null) {
                    ((avpr) obj10).a();
                }
                break;
            case 8:
                Object obj11 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.d;
                Object obj14 = this.b;
                String str = (String) obj;
                String str2 = Build.MODEL;
                tge tgeVarB = tgf.b("https://www.youtube.com/api/lounge/screens/em");
                try {
                    HashMap map = new HashMap();
                    map.put("screenId", ((xwc) obj12).b);
                    map.put("method", obj14);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("deviceId", str);
                    jSONObject.put("deviceDescription", str2);
                    jSONObject.put("event", obj13);
                    map.put("params", jSONObject.toString());
                    tgeVarB.d = tgd.d(map, tfs.a);
                    xyk xykVar = (xyk) obj11;
                    if (xykVar.e.m(14, 45627566L)) {
                        tgeVarB.d(tok.MDX_TVSIGNIN_PROGRESS_API);
                    }
                    taf.j(xykVar.c.submit(afwl.j(new wci(obj11, tgeVarB, 11, bArr))), new wuy(obj11, 8));
                } catch (JSONException unused) {
                    ((agrc) ((agrc) xyk.a.b().i(agso.a, "MDX.ExternalMessage")).k("com/google/android/libraries/youtube/mdx/remote/ExternalMessageControllerImpl", "handlePayloadCreationError", 210, "ExternalMessageControllerImpl.java")).t("Error while creating the POST payload.");
                    zvl zvlVar = ((xyk) obj11).d;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.j = 15;
                    zvjVarA.d("Error while creating the POST payload.");
                    zvlVar.a(zvjVarA.a());
                    return;
                }
                break;
            case 9:
                File file = (File) obj;
                if (file != null) {
                    Object obj15 = this.d;
                    Object obj16 = this.b;
                    yfo yfoVar = (yfo) this.a;
                    ConcurrentHashMap concurrentHashMap = yfoVar.b;
                    File file2 = (File) obj16;
                    ygu yguVarC = yfoVar.c(file, file2);
                    concurrentHashMap.put(obj15, yguVarC);
                    yfoVar.a.add(yguVarC);
                    if (yfoVar.j == null) {
                        yfoVar.j = file2.getParentFile();
                        File file3 = yfoVar.j;
                        if (file3 != null) {
                            yfoVar.c.b(new tar(file3, 13));
                        }
                    }
                    Object obj17 = this.c;
                    zhq zhqVar = zhq.ABR;
                    yguVarC.A((xxy) obj17);
                }
                break;
            default:
                arkm arkmVar = (arkm) this.d;
                boolean z = arkmVar.I;
                arkf arkfVarA = arkf.a(arkmVar.v);
                ?? r4 = this.c;
                if (arkfVarA == null) {
                    arkfVarA = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                }
                arkf arkfVar = arkfVarA;
                Object obj18 = this.b;
                Object obj19 = this.a;
                xir xirVar = ((aegs) obj19).n;
                if (z) {
                    try {
                        if (!((String) obj18).isEmpty()) {
                            ((aegh) ((aegs) obj19).a.io()).j((String) obj18, r4, arkfVar, xirVar, ((aegs) obj19).o, ((aegs) obj19).p, new aegp(obj19, arkfVar, r4, i));
                        } else if (!((String) obj18).isEmpty() && (webView = ((aegs) obj19).m) != null) {
                            webView.loadUrl((String) obj18);
                        }
                    } catch (RuntimeException e) {
                        zvp.b(zvn.b, zvm.af, "RuntimeException while calling WebView#loadUrl: ".concat(String.valueOf(e.getMessage() == null ? e.getMessage() : "no error message")), e);
                        return;
                    }
                } else if (!((String) obj18).isEmpty()) {
                    webView.loadUrl((String) obj18);
                }
                break;
        }
    }

    public /* synthetic */ gst(gsw gswVar, amyv amyvVar, dii diiVar, xvr xvrVar, int i) {
        this.$cid = i;
        this.a = gswVar;
        this.b = amyvVar;
        this.c = diiVar;
        this.d = xvrVar;
    }

    public /* synthetic */ gst(gut gutVar, Object obj, Object obj2, Map map, int i) {
        this.$cid = i;
        this.c = gutVar;
        this.a = obj;
        this.d = obj2;
        this.b = map;
    }

    public /* synthetic */ gst(gut gutVar, Map map, String str, avpr avprVar, int i) {
        this.$cid = i;
        this.c = gutVar;
        this.b = map;
        this.d = str;
        this.a = avprVar;
    }

    public /* synthetic */ gst(gwa gwaVar, ajwo ajwoVar, aoht aohtVar, hxb hxbVar, int i) {
        this.$cid = i;
        this.c = gwaVar;
        this.d = ajwoVar;
        this.b = aohtVar;
        this.a = hxbVar;
    }

    public /* synthetic */ gst(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ gst(gpo gpoVar, wlu wluVar, zza zzaVar, gpm gpmVar, int i) {
        this.$cid = i;
        this.a = gpoVar;
        this.d = wluVar;
        this.b = zzaVar;
        this.c = gpmVar;
    }
}
