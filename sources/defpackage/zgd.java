package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatEditText;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.youtube.media.interfaces.AutocropCalculator;
import com.google.android.libraries.youtube.media.interfaces.AutocropFormat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.AutocropConfigOuterClass$AutocropConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zgd implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zgd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, mbb] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        weh wehVar;
        afcy afcyVar;
        String strE;
        int i = 4;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((zgj) this.a).o((twe) obj);
                break;
            case 1:
                yyg yygVar = (yyg) this.a;
                zjr zjrVar = yygVar.a.d;
                yygVar.d = zjrVar.bm() ? new yyf(zjrVar) : null;
                break;
            case 2:
                ((zhl) this.a).f = ((Boolean) obj).booleanValue();
                break;
            case 3:
                atpl atplVar = (atpl) obj;
                int i2 = atplVar.j;
                arfb arfbVarA = arfb.a(i2);
                if (arfbVarA == null) {
                    arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                zkd zkdVar = (zkd) this.a;
                zkdVar.b = arfbVarA;
                arfb arfbVarA2 = arfb.a(atplVar.i);
                if (arfbVarA2 == null) {
                    arfbVarA2 = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                zkdVar.c = arfbVarA2;
                ajhj ajhjVarA = ajhj.a(atplVar.k);
                if (ajhjVarA == null) {
                    ajhjVarA = ajhj.AUDIO_QUALITY_SETTING_UNKNOWN;
                }
                zkdVar.d = ajhjVarA;
                arfb arfbVarA3 = arfb.a(i2);
                if (arfbVarA3 == null) {
                    arfbVarA3 = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                zkdVar.f = arfbVarA3;
                arfb arfbVarA4 = arfb.a(atplVar.i);
                if (arfbVarA4 == null) {
                    arfbVarA4 = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                zkdVar.g = arfbVarA4;
                ajhj ajhjVarA2 = ajhj.a(atplVar.k);
                if (ajhjVarA2 == null) {
                    ajhjVarA2 = ajhj.AUDIO_QUALITY_SETTING_UNKNOWN;
                }
                zkdVar.h = ajhjVarA2;
                zkdVar.j = true;
                tqj tqjVar = zkdVar.k;
                if (tqjVar != null) {
                    int i3 = tqr.a;
                    if (tqjVar.k(1073830305) || (tqjVar.a(1074093018) & 2) != 0) {
                        tqh tqhVarD = tqjVar.d(3);
                        tqhVarD.b(219546, zkdVar.e().e);
                        tqhVarD.b(219549, zkdVar.d().e);
                        tqhVarD.b(88480, 1L);
                        tqhVarD.a();
                    }
                }
                zkdVar.k();
                break;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                z = iIntValue == 3 || iIntValue == 10;
                zkd zkdVar2 = (zkd) this.a;
                zkdVar2.e = z;
                zkdVar2.i = z;
                zkdVar2.k();
                break;
            case 5:
                weo weoVar = (weo) obj;
                if (weoVar != null && (wehVar = weoVar.c) != null) {
                    Object obj2 = this.a;
                    aqff aqffVar = (aqff) wehVar;
                    int iOrdinal = aqffVar.getAction().ordinal();
                    if (iOrdinal == 1) {
                        zoz zozVar = (zoz) obj2;
                        if (zozVar.g && aqffVar.c.d == 3) {
                            aktj emoji = aqffVar.getEmoji();
                            if (emoji.e.size() > 0) {
                                String str = (String) emoji.e.get(0);
                                if (zozVar.getSelectionStart() < 0 || zozVar.getSelectionEnd() < 0) {
                                    zozVar.getEditableText().insert(((AppCompatEditText) obj2).getText().length(), str);
                                } else {
                                    zozVar.getEditableText().replace(zozVar.getSelectionStart(), zozVar.getSelectionEnd(), str);
                                }
                                zozVar.k(emoji);
                            }
                        } else if (aqffVar.c.d == 2) {
                            String text = aqffVar.getText();
                            boolean zBooleanValue = aqffVar.getShouldConditionallyPrependWhitespace().booleanValue();
                            if (aqffVar.getShouldAppendWhitespace().booleanValue()) {
                                text = String.valueOf(text).concat(" ");
                            }
                            int selectionStart = zozVar.getSelectionStart() >= 0 ? zozVar.getSelectionStart() : ((AppCompatEditText) obj2).getText().length() + 1;
                            int selectionEnd = zozVar.getSelectionEnd() >= 0 ? zozVar.getSelectionEnd() : ((AppCompatEditText) obj2).getText().length() + 1;
                            if (zBooleanValue && selectionStart > 0 && " \n\r-_".indexOf(((AppCompatEditText) obj2).getText().charAt(selectionStart - 1)) == -1) {
                                text = " ".concat(String.valueOf(text));
                            }
                            zozVar.getEditableText().replace(selectionStart, selectionEnd, text);
                        }
                    } else if (iOrdinal == 2) {
                        ((zoz) obj2).dispatchKeyEvent(new KeyEvent(0, 67));
                    } else if (iOrdinal == 4) {
                        zoz zozVar2 = (zoz) obj2;
                        ((InputMethodManager) zozVar2.h.getSystemService("input_method")).hideSoftInputFromWindow(zozVar2.getWindowToken(), 0);
                    }
                    zoz zozVar3 = (zoz) obj2;
                    wer werVarE = zozVar3.d.e();
                    werVarE.j(zozVar3.e);
                    werVarE.c(wem.LEGACY_API_ALLOWLIST_TOKEN).D();
                    CommandOuterClass$Command commandOuterClass$Command = zozVar3.i;
                    if (commandOuterClass$Command != null) {
                        zozVar3.j.a(commandOuterClass$Command, zoz.d(zozVar3)).D();
                    }
                    break;
                }
                break;
            case 6:
                zpr zprVar = (zpr) this.a;
                zpu zpuVar = zprVar.f;
                zpx zpxVar = (zpx) obj;
                if (zpuVar != null) {
                    int iIntValue2 = ((Integer) zpxVar.a().orElse(0)).intValue();
                    zprVar.l(zpxVar, !zprVar.o.m(13, 45703450L) || zpr.k(zprVar.l.c));
                    zpuVar.d(iIntValue2);
                }
                break;
            case 7:
                ((zpv) this.a).j((aciz) obj);
                break;
            case 8:
                this.a.d(agcl.c((tfl) obj));
                break;
            case 9:
                alik alikVar = (alik) obj;
                aode aodeVar = alikVar.p;
                if (aodeVar == null) {
                    aodeVar = aode.a;
                }
                if ((aodeVar.b & 16384) != 0) {
                    aode aodeVar2 = alikVar.p;
                    if (aodeVar2 == null) {
                        aodeVar2 = aode.a;
                    }
                    aodd aoddVar = aodeVar2.f;
                    if (aoddVar == null) {
                        aoddVar = aodd.a;
                    }
                    if (aoddVar.b) {
                        z = true;
                    }
                }
                ((aaak) this.a).a = z;
                break;
            case 10:
                List list = (List) obj;
                Object obj3 = this.a;
                aajm aajmVar = (aajm) obj3;
                ListenableFuture listenableFutureA = aajmVar.a(list);
                ahek ahekVarH = ahng.h(listenableFutureA);
                ahcx ahcxVarC = afwl.c(new wan(obj3, list, i, null == true ? 1 : 0));
                Executor executor = aajmVar.d;
                ListenableFuture listenableFutureB = ahekVarH.b(ahcxVarC, executor);
                ListenableFuture listenableFutureB2 = aajmVar.i.b();
                aajmVar.h = ahng.h(listenableFutureA, listenableFutureB, listenableFutureB2).a(afwl.j(new vtq(listenableFutureB2, listenableFutureA, listenableFutureB, 10, (byte[]) null)), executor);
                taf.g(aajmVar.h, new uqk(9));
                break;
            case 11:
                aanv aanvVar = (aanv) obj;
                aakx aakxVar = (aakx) this.a;
                if (!aakxVar.b) {
                    int iOrdinal2 = aanvVar.b.ordinal();
                    if (iOrdinal2 == 1) {
                        aaew aaewVarD = aakxVar.e.d();
                        if (aaewVarD != null) {
                            aakxVar.a.addAll(aaewVarD.k(aakxVar.c));
                        } else {
                            aakxVar.b = true;
                        }
                    } else if (iOrdinal2 == 2) {
                        aofh aofhVar = aanvVar.a;
                        if (wfs.b(aofhVar.d) == aakxVar.f) {
                            String strH = wfs.h(aofhVar.d);
                            HashSet hashSet = aakxVar.a;
                            hashSet.remove(strH);
                            if (hashSet.isEmpty()) {
                                aajg.a(aakxVar);
                                aakxVar.b = true;
                            }
                        }
                    } else if (iOrdinal2 == 3) {
                        aajg.a(aakxVar);
                        aakxVar.b = true;
                    } else if (iOrdinal2 == 5) {
                        aakxVar.b = true;
                    }
                }
                break;
            case 12:
                aanv aanvVar2 = (aanv) obj;
                awkv awkvVar = (awkv) ((aany) this.a).i.get(Long.valueOf(wfs.b(aanvVar2.a.d)));
                if (awkvVar != null) {
                    awkvVar.aI().kk(aanvVar2);
                }
                break;
            case 13:
                aret aretVar = (aret) ((weo) obj).c;
                Object obj4 = this.a;
                if (aretVar != null) {
                    try {
                        ((aarj) obj4).g.a(aarj.d(aretVar.b(), aretVar.getLastPlaybackPositionSeconds().longValue()));
                    } catch (aaob e) {
                        ((agrc) ((agrc) ((agrc) aarj.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "handleVideoPlaybackPositionEntityUpdate", (char) 272, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("Failed to update video playback position.");
                        return;
                    }
                }
                break;
            case 14:
                aatf aatfVar = (aatf) obj;
                aask aaskVar = (aask) this.a;
                aaskVar.o = false;
                if (aatfVar == aatf.b) {
                    aaskVar.n = true;
                    aaskVar.f(aasj.a(4).a());
                } else if (aatfVar == aatf.a) {
                    aaskVar.n = false;
                } else if (aatfVar == aatf.c) {
                    aaskVar.n = false;
                    Object obj5 = aaskVar.v.c;
                    if (obj5 != null) {
                        aasi aasiVarA = aasj.a(13);
                        aasiVarA.f((String) obj5);
                        aasiVarA.e(1);
                        aaskVar.f(aasiVarA.a());
                    }
                }
                break;
            case 15:
                if (((Boolean) obj).booleanValue() && (strE = (afcyVar = (afcy) this.a).e()) != null) {
                    Intent intent = new Intent();
                    Context context = (Context) afcyVar.b;
                    intent.setClassName(context, strE);
                    intent.setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
                    aauq.a(context, intent);
                    break;
                }
                break;
            case 16:
                ((aatc) this.a).j();
                break;
            case 17:
                ((aawk) this.a).a.c(ModuleDescriptor.MODULE_VERSION);
                break;
            case 18:
                ((aawk) this.a).a.c(215);
                break;
            case 19:
                aazu aazuVar = (aazu) this.a;
                zdj zdjVar = aazuVar.c;
                AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig = (AutocropConfigOuterClass$AutocropConfig) obj;
                ((AutocropCalculator) zdjVar.a).setAutocropConfig(autocropConfigOuterClass$AutocropConfig);
                ajii ajiiVar = autocropConfigOuterClass$AutocropConfig.b;
                if (ajiiVar == null) {
                    ajiiVar = ajii.a;
                }
                int i4 = ajiiVar.b;
                ajii ajiiVar2 = autocropConfigOuterClass$AutocropConfig.b;
                if (ajiiVar2 == null) {
                    ajiiVar2 = ajii.a;
                }
                zdjVar.b = new AutocropFormat(i4, ajiiVar2.c);
                aazuVar.f = null;
                break;
            default:
                ((aamo) this.a).p(Optional.empty());
                break;
        }
    }
}
