package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cve implements cvl {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 16, 15, 14, 17, 18, 19, 20, 21, 7};
    private static final eol j;
    private static final eol k;
    private boolean c;
    private int d;
    private agke e;
    private int h;
    private int i;
    private dbl g = new dbk(1);
    private boolean f = true;

    static {
        final int i = 1;
        j = new eol(new cvd() { // from class: cvc
            @Override // defpackage.cvd
            public final Constructor a() {
                if (i == 0) {
                    int i2 = cve.a;
                    return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cvi.class).getConstructor(null);
                }
                int i3 = cve.a;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cvi.class).getConstructor(Integer.TYPE);
                }
                return null;
            }
        });
        final int i2 = 0;
        k = new eol(new cvd() { // from class: cvc
            @Override // defpackage.cvd
            public final Constructor a() {
                if (i2 == 0) {
                    int i3 = cve.a;
                    return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cvi.class).getConstructor(null);
                }
                int i4 = cve.a;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cvi.class).getConstructor(Integer.TYPE);
                }
                return null;
            }
        });
    }

    private final void h(int i, List list) {
        switch (i) {
            case 0:
                list.add(new ddl(1, null));
                break;
            case 1:
                list.add(new ddl(0));
                break;
            case 2:
                list.add(new ddn(this.c ? 1 : 0));
                break;
            case 3:
                list.add(new cwm(this.c ? 1 : 0));
                break;
            case 4:
                cvi cviVarG = j.g(0);
                if (cviVarG == null) {
                    list.add(new cxa());
                } else {
                    list.add(cviVarG);
                }
                break;
            case 5:
                list.add(new cxc());
                break;
            case 6:
                list.add(new czc(this.g, true == this.f ? 0 : 2));
                break;
            case 7:
                list.add(new czh((this.d | (this.c ? 1 : 0)) == true ? 1 : 0));
                break;
            case 8:
                list.add(new daa(this.g, (true != this.f ? 32 : 0) | SemanticState.LiveRegion, agpi.a, null));
                list.add(new dae(this.g, true != this.f ? 16 : 0));
                break;
            case 9:
                list.add(new dar());
                break;
            case 10:
                list.add(new del());
                break;
            case 11:
                if (this.e == null) {
                    this.e = agpi.a;
                }
                list.add(new deu(!this.f ? 1 : 0, this.g, new nzd(0L), new elq(this.e)));
                break;
            case 12:
                list.add(new dfa());
                break;
            case 14:
                list.add(new cxi(this.h, 0));
                break;
            case 15:
                cvi cviVarG2 = k.g(new Object[0]);
                if (cviVarG2 != null) {
                    list.add(cviVarG2);
                }
                break;
            case 16:
                list.add(new cwq(!this.f ? 1 : 0, this.g));
                break;
            case 17:
                list.add(new cwx(2, (byte[]) null));
                break;
            case 18:
                list.add(new dfe(0));
                break;
            case 19:
                list.add(new cwx(0));
                break;
            case 20:
                list.add(new cxi(this.i, 1, null));
                break;
            case 21:
                list.add(new dfe(1, null));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:204:0x0333  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.cvl
    public final synchronized cvi[] a(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        int i2;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        if (str != null) {
            String strG = bsy.g(str);
            switch (strG.hashCode()) {
                case -2123537834:
                    if (strG.equals("audio/eac3-joc")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662384011:
                    if (strG.equals("video/mp2p")) {
                        i = 10;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662384007:
                    if (strG.equals("video/mp2t")) {
                        i = 11;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662095187:
                    if (strG.equals("video/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case -1606874997:
                    if (strG.equals("audio/amr-wb")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487656890:
                    if (strG.equals("image/avif")) {
                        i = 21;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487464693:
                    if (strG.equals("image/heic")) {
                        i = 20;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487464690:
                    if (strG.equals("image/heif")) {
                        i = 20;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487394660:
                    if (strG.equals("image/jpeg")) {
                        i = 14;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487018032:
                    if (strG.equals("image/webp")) {
                        i = 18;
                    } else {
                        i = -1;
                    }
                    break;
                case -1248337486:
                    if (strG.equals("application/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case -1079884372:
                    if (strG.equals("video/x-msvideo")) {
                        i = 16;
                    } else {
                        i = -1;
                    }
                    break;
                case -1004728940:
                    if (strG.equals("text/vtt")) {
                        i = 13;
                    } else {
                        i = -1;
                    }
                    break;
                case -879272239:
                    if (strG.equals("image/bmp")) {
                        i = 19;
                    } else {
                        i = -1;
                    }
                    break;
                case -879258763:
                    if (strG.equals("image/png")) {
                        i = 17;
                    } else {
                        i = -1;
                    }
                    break;
                case -387023398:
                    if (strG.equals("audio/x-matroska")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case -43467528:
                    if (strG.equals("application/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case 13915911:
                    if (strG.equals("video/x-flv")) {
                        i = 5;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078296:
                    if (strG.equals("audio/ac3")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078297:
                    if (strG.equals("audio/ac4")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078669:
                    if (strG.equals("audio/amr")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case 187090232:
                    if (strG.equals("audio/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case 187091926:
                    if (strG.equals("audio/ogg")) {
                        i = 9;
                    } else {
                        i = -1;
                    }
                    break;
                case 187099443:
                    if (strG.equals("audio/wav")) {
                        i = 12;
                    } else {
                        i = -1;
                    }
                    break;
                case 1331848029:
                    if (strG.equals("video/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case 1503095341:
                    if (strG.equals("audio/3gpp")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504578661:
                    if (strG.equals("audio/eac3")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504619009:
                    if (strG.equals("audio/flac")) {
                        i = 4;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504824762:
                    if (strG.equals("audio/midi")) {
                        i = 15;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504831518:
                    if (strG.equals("audio/mpeg")) {
                        i = 7;
                    } else {
                        i = -1;
                    }
                    break;
                case 1505118770:
                    if (strG.equals("audio/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case 2039520277:
                    if (strG.equals("video/x-matroska")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            h(i, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            String strAe = ahno.ae(lastPathSegment);
            if (strAe.endsWith(".ac3") || strAe.endsWith(".ec3")) {
                i2 = 0;
            } else if (strAe.endsWith(".ac4")) {
                i2 = 1;
            } else if (strAe.endsWith(".adts") || strAe.endsWith(".aac")) {
                i2 = 2;
            } else if (strAe.endsWith(".amr")) {
                i2 = 3;
            } else if (strAe.endsWith(".flac")) {
                i2 = 4;
            } else if (strAe.endsWith(".flv")) {
                i2 = 5;
            } else if (strAe.endsWith(".mid") || strAe.endsWith(".midi") || strAe.endsWith(".smf")) {
                i2 = 15;
            } else if (strAe.startsWith(".mk", strAe.length() - 4) || strAe.endsWith(".webm")) {
                i2 = 6;
            } else if (strAe.endsWith(".mp3")) {
                i2 = 7;
            } else if (strAe.endsWith(".mp4") || strAe.startsWith(".m4", strAe.length() - 4) || strAe.startsWith(".mp4", strAe.length() - 5) || strAe.startsWith(".cmf", strAe.length() - 5)) {
                i2 = 8;
            } else if (strAe.startsWith(".og", strAe.length() - 4) || strAe.endsWith(".opus")) {
                i2 = 9;
            } else if (strAe.endsWith(".ps") || strAe.endsWith(".mpeg") || strAe.endsWith(".mpg") || strAe.endsWith(".m2p")) {
                i2 = 10;
            } else if (strAe.endsWith(".ts") || strAe.startsWith(".ts", strAe.length() - 4)) {
                i2 = 11;
            } else if (strAe.endsWith(".wav") || strAe.endsWith(".wave")) {
                i2 = 12;
            } else if (strAe.endsWith(".vtt") || strAe.endsWith(".webvtt")) {
                i2 = 13;
            } else if (strAe.endsWith(".jpg") || strAe.endsWith(".jpeg")) {
                i2 = 14;
            } else if (strAe.endsWith(".avi")) {
                i2 = 16;
            } else if (strAe.endsWith(".png")) {
                i2 = 17;
            } else if (strAe.endsWith(".webp")) {
                i2 = 18;
            } else if (strAe.endsWith(".bmp") || strAe.endsWith(".dib")) {
                i2 = 19;
            } else if (strAe.endsWith(".heic") || strAe.endsWith(".heif")) {
                i2 = 20;
            } else if (strAe.endsWith(".avif")) {
                i2 = 21;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (i2 != -1 && i2 != i) {
            h(i2, arrayList);
        }
        int[] iArr = b;
        for (int i3 = 0; i3 < 21; i3++) {
            int i4 = iArr[i3];
            if (i4 != i && i4 != i2) {
                h(i4, arrayList);
            }
        }
        return (cvi[]) arrayList.toArray(new cvi[0]);
    }

    @Deprecated
    public final synchronized void b(boolean z) {
        this.f = z;
    }

    public final synchronized void c() {
        this.c = true;
    }

    public final synchronized void d() {
        this.i = 1;
    }

    public final synchronized void e() {
        this.h = 1;
    }

    public final synchronized void f() {
        this.d = 4;
    }

    public final synchronized void g(dbl dblVar) {
        this.g = dblVar;
    }
}
