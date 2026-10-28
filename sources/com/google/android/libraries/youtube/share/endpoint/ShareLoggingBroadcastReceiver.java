package com.google.android.libraries.youtube.share.endpoint;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aciz;
import defpackage.aelf;
import defpackage.aelm;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.aihf;
import defpackage.aihl;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.ajdj;
import defpackage.ajdk;
import defpackage.ajwo;
import defpackage.amdd;
import defpackage.amdj;
import defpackage.amdp;
import defpackage.ameb;
import defpackage.aptc;
import defpackage.aptg;
import defpackage.aqej;
import defpackage.aqjc;
import defpackage.lqa;
import defpackage.vxe;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xgu;
import defpackage.xhb;
import internal.org.jni_zero.CommonApis;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ShareLoggingBroadcastReceiver extends aelf {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/share/endpoint/ShareLoggingBroadcastReceiver");
    public xgn c;
    public Optional d;
    public lqa e;

    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x01a9, please report this as an issue */
    @Override // defpackage.aelf, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte[] byteArrayExtra;
        ajwo ajwoVar;
        aciz acizVar;
        aqej aqejVar;
        ComponentName componentName;
        Object obj;
        Object obj2;
        String str;
        aqej aqejVar2;
        String str2;
        ajwo ajwoVar2;
        aihf aihfVarCreateBuilder;
        aqej aqejVar3;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((aelm) CommonApis.j(context)).ec(this);
                    this.a = true;
                }
            }
        }
        if (!intent.hasExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array") || (byteArrayExtra = intent.getByteArrayExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array")) == null) {
            return;
        }
        aciz acizVar2 = null;
        try {
            ajwoVar = (ajwo) aihn.parseFrom(ajwo.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/share/endpoint/ShareLoggingBroadcastReceiver", "parseCommand", (char) 133, "ShareLoggingBroadcastReceiver.java")).t("Failed to parse command byte array ");
            ajwoVar = null;
        }
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aptg.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajdj.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajdj.b);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    ajdj ajdjVar = (ajdj) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                    String str3 = ajdjVar.g;
                    if ((ajdjVar.c & 8) != 0) {
                        aqejVar = ajdjVar.h;
                        if (aqejVar == null) {
                            aqejVar = aqej.a;
                        }
                    } else {
                        aqejVar = null;
                    }
                    acizVar = new aciz(str3, aqejVar, (byte[]) null);
                }
                if (acizVar2 != null) {
                    componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    obj = acizVar2.a;
                    if (obj != null) {
                        aqejVar2 = (aqej) obj;
                        if ((aqejVar2.b & 2) != 0 && !this.d.isEmpty()) {
                            str2 = aqejVar2.c;
                            if (!str2.isEmpty()) {
                                aihfVarCreateBuilder = ajdk.a.createBuilder();
                                if (componentName != null) {
                                    String packageName = componentName.getPackageName();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    ajdk ajdkVar = (ajdk) aihfVarCreateBuilder.instance;
                                    packageName.getClass();
                                    ajdkVar.b |= 1;
                                    ajdkVar.c = packageName;
                                    String className = componentName.getClassName();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    ajdk ajdkVar2 = (ajdk) aihfVarCreateBuilder.instance;
                                    className.getClass();
                                    ajdkVar2.b |= 2;
                                    ajdkVar2.d = className;
                                }
                                aihf aihfVarCreateBuilder2 = aqjc.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                aqjc aqjcVar = (aqjc) aihfVarCreateBuilder2.instance;
                                aqjcVar.e = 1;
                                aqjcVar.b |= 1;
                                ajdk ajdkVar3 = (ajdk) aihfVarCreateBuilder.build();
                                aihfVarCreateBuilder2.copyOnWrite();
                                aqjc aqjcVar2 = (aqjc) aihfVarCreateBuilder2.instance;
                                ajdkVar3.getClass();
                                aqjcVar2.d = ajdkVar3;
                                aqjcVar2.c = 3;
                                aqjc aqjcVar3 = (aqjc) aihfVarCreateBuilder2.build();
                                aihf aihfVarCreateBuilder3 = aptc.a.createBuilder();
                                aihfVarCreateBuilder3.copyOnWrite();
                                aptc aptcVar = (aptc) aihfVarCreateBuilder3.instance;
                                aqjcVar3.getClass();
                                aptcVar.e = aqjcVar3;
                                aptcVar.b |= 8;
                                this.e.B(str2, (aptc) aihfVarCreateBuilder3.build());
                            }
                            vxe vxeVar = (vxe) this.d.get();
                            ajwoVar2 = aqejVar2.d;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            vxeVar.a(ajwoVar2);
                        }
                    }
                    if (componentName != null) {
                        obj2 = acizVar2.b;
                        str = (String) obj2;
                        if (str.isEmpty()) {
                        }
                        xgj xgjVar = new xgj(xhb.b(134792));
                        this.c.D(xhb.a(146176), xgu.b, ajwoVar);
                        this.c.l(xgjVar);
                        xgn xgnVar = this.c;
                        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                        String str4 = componentName.getPackageName() + '/' + componentName.getClassName();
                        aihf aihfVarCreateBuilder4 = amdd.a.createBuilder();
                        aihf aihfVarCreateBuilder5 = amdp.a.createBuilder();
                        aihfVarCreateBuilder5.copyOnWrite();
                        amdp amdpVar = (amdp) aihfVarCreateBuilder5.instance;
                        obj2.getClass();
                        amdpVar.b |= 1;
                        amdpVar.c = str;
                        amdp amdpVar2 = (amdp) aihfVarCreateBuilder5.build();
                        aihfVarCreateBuilder4.copyOnWrite();
                        amdd amddVar = (amdd) aihfVarCreateBuilder4.instance;
                        amdpVar2.getClass();
                        amddVar.w = amdpVar2;
                        amddVar.d |= 1;
                        aihf aihfVarCreateBuilder6 = amdj.a.createBuilder();
                        aihfVarCreateBuilder6.copyOnWrite();
                        amdj amdjVar = (amdj) aihfVarCreateBuilder6.instance;
                        amdjVar.b |= 1;
                        amdjVar.c = str4;
                        amdj amdjVar2 = (amdj) aihfVarCreateBuilder6.build();
                        aihfVarCreateBuilder4.copyOnWrite();
                        amdd amddVar2 = (amdd) aihfVarCreateBuilder4.instance;
                        amdjVar2.getClass();
                        amddVar2.i = amdjVar2;
                        amddVar2.b |= 32;
                        xgnVar.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder4.build());
                    }
                }
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aptg.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aptg aptgVar = (aptg) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            String str5 = aptgVar.h;
            if ((aptgVar.c & SemanticState.Hidden) != 0) {
                aqejVar3 = aptgVar.i;
                if (aqejVar3 == null) {
                    aqejVar3 = aqej.a;
                }
            } else {
                aqejVar3 = null;
            }
            acizVar = new aciz(str5, aqejVar3, (byte[]) null);
            acizVar2 = acizVar;
            if (acizVar2 != null) {
                componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                obj = acizVar2.a;
                if (obj != null) {
                    aqejVar2 = (aqej) obj;
                    if ((aqejVar2.b & 2) != 0) {
                        str2 = aqejVar2.c;
                        if (!str2.isEmpty()) {
                            aihfVarCreateBuilder = ajdk.a.createBuilder();
                            if (componentName != null) {
                                String packageName2 = componentName.getPackageName();
                                aihfVarCreateBuilder.copyOnWrite();
                                ajdk ajdkVar4 = (ajdk) aihfVarCreateBuilder.instance;
                                packageName2.getClass();
                                ajdkVar4.b |= 1;
                                ajdkVar4.c = packageName2;
                                String className2 = componentName.getClassName();
                                aihfVarCreateBuilder.copyOnWrite();
                                ajdk ajdkVar5 = (ajdk) aihfVarCreateBuilder.instance;
                                className2.getClass();
                                ajdkVar5.b |= 2;
                                ajdkVar5.d = className2;
                            }
                            aihf aihfVarCreateBuilder7 = aqjc.a.createBuilder();
                            aihfVarCreateBuilder7.copyOnWrite();
                            aqjc aqjcVar4 = (aqjc) aihfVarCreateBuilder7.instance;
                            aqjcVar4.e = 1;
                            aqjcVar4.b |= 1;
                            ajdk ajdkVar6 = (ajdk) aihfVarCreateBuilder.build();
                            aihfVarCreateBuilder7.copyOnWrite();
                            aqjc aqjcVar5 = (aqjc) aihfVarCreateBuilder7.instance;
                            ajdkVar6.getClass();
                            aqjcVar5.d = ajdkVar6;
                            aqjcVar5.c = 3;
                            aqjc aqjcVar6 = (aqjc) aihfVarCreateBuilder7.build();
                            aihf aihfVarCreateBuilder8 = aptc.a.createBuilder();
                            aihfVarCreateBuilder8.copyOnWrite();
                            aptc aptcVar2 = (aptc) aihfVarCreateBuilder8.instance;
                            aqjcVar6.getClass();
                            aptcVar2.e = aqjcVar6;
                            aptcVar2.b |= 8;
                            this.e.B(str2, (aptc) aihfVarCreateBuilder8.build());
                        }
                        vxe vxeVar2 = (vxe) this.d.get();
                        ajwoVar2 = aqejVar2.d;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar2.a(ajwoVar2);
                    }
                }
                if (componentName != null) {
                    obj2 = acizVar2.b;
                    str = (String) obj2;
                    if (str.isEmpty()) {
                        xgj xgjVar2 = new xgj(xhb.b(134792));
                        this.c.D(xhb.a(146176), xgu.b, ajwoVar);
                        this.c.l(xgjVar2);
                        xgn xgnVar2 = this.c;
                        ameb amebVar2 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                        String str6 = componentName.getPackageName() + '/' + componentName.getClassName();
                        aihf aihfVarCreateBuilder9 = amdd.a.createBuilder();
                        aihf aihfVarCreateBuilder10 = amdp.a.createBuilder();
                        aihfVarCreateBuilder10.copyOnWrite();
                        amdp amdpVar3 = (amdp) aihfVarCreateBuilder10.instance;
                        obj2.getClass();
                        amdpVar3.b |= 1;
                        amdpVar3.c = str;
                        amdp amdpVar4 = (amdp) aihfVarCreateBuilder10.build();
                        aihfVarCreateBuilder9.copyOnWrite();
                        amdd amddVar3 = (amdd) aihfVarCreateBuilder9.instance;
                        amdpVar4.getClass();
                        amddVar3.w = amdpVar4;
                        amddVar3.d |= 1;
                        aihf aihfVarCreateBuilder11 = amdj.a.createBuilder();
                        aihfVarCreateBuilder11.copyOnWrite();
                        amdj amdjVar3 = (amdj) aihfVarCreateBuilder11.instance;
                        amdjVar3.b |= 1;
                        amdjVar3.c = str6;
                        amdj amdjVar4 = (amdj) aihfVarCreateBuilder11.build();
                        aihfVarCreateBuilder9.copyOnWrite();
                        amdd amddVar4 = (amdd) aihfVarCreateBuilder9.instance;
                        amdjVar4.getClass();
                        amddVar4.i = amdjVar4;
                        amddVar4.b |= 32;
                        xgnVar2.o(amebVar2, xgjVar2, (amdd) aihfVarCreateBuilder9.build());
                    }
                }
            }
        }
    }
}
