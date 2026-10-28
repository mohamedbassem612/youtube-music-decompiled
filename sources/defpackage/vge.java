package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vge {
    public final Executor a;
    private final Context c;
    private final Object d = new Object();
    public agke b = agpi.a;
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public vge(Context context, Executor executor) {
        this.c = context;
        this.a = executor;
    }

    static final int d() {
        return bll.b().a();
    }

    public final agke a(String str) {
        String str2 = (String) this.f.get(str);
        Map map = this.e;
        return map.get(str2) == null ? agpi.a : agke.n((Collection) map.get(str2));
    }

    public final void b() {
        blu bluVar = new blu(this.c, new awy("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs));
        bluVar.c(new blt(500L));
        bluVar.a();
        vgc vgcVar = new vgc(this, bluVar);
        if (bluVar.d == null) {
            bluVar.d = new afx(0);
        }
        bluVar.d.add(vgcVar);
        bll.e(bluVar);
        if (d() == 1) {
            this.a.execute(new ull(this, 17));
        }
    }

    public final void c() {
        if (d() != 1) {
            zvp.a(zvn.b, zvm.j, "VideoFX: Reading emoji from device failed");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.c.getResources().openRawResource(R.raw.emoji_list_with_variations), StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    arrayList.add(line);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List listH = agfm.c(",").h((String) it.next());
                int iCharCount = 0;
                blm blmVarB = null;
                vgd vgdVar = new vgd((String) listH.get(0), (String) listH.get(1), (listH.size() != 3 || ((String) listH.get(2)).isEmpty()) ? null : (String) listH.get(2));
                if (vgdVar.a()) {
                    Map map = this.f;
                    String str = vgdVar.a;
                    String str2 = vgdVar.c;
                    map.put(str, str2);
                    Map map2 = this.e;
                    if (map2.get(str2) == null) {
                        map2.put(str2, new ArrayList());
                    }
                    ((List) map2.get(str2)).add(str);
                }
                if (!vgdVar.a() || vgdVar.b.equals(vgdVar.c)) {
                    String str3 = vgdVar.a;
                    bll bllVarB = bll.b();
                    azs.h(bllVarB.d(), "Not initialized yet");
                    eqf eqfVar = bllVarB.e.b;
                    blo bloVar = new blo((zg) ((dep) eqfVar.c).b, eqfVar.a, (int[]) eqfVar.d);
                    int length = str3.length();
                    while (true) {
                        if (iCharCount >= length) {
                            if (!bloVar.d()) {
                                break;
                            }
                            blmVarB = bloVar.b();
                            break;
                        } else {
                            int iCodePointAt = Character.codePointAt(str3, iCharCount);
                            if (bloVar.a(iCodePointAt) != 2) {
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                    }
                    if (blmVarB != null) {
                        arrayList2.add(str3);
                    }
                }
            }
            synchronized (this.d) {
                this.b = agke.n(arrayList2);
            }
        } catch (IOException e) {
            zvp.a(zvn.b, zvm.j, "VideoFX: Reading emoji from device failed ".concat(String.valueOf(e.getMessage())));
        }
    }
}
