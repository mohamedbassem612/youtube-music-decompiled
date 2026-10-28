package defpackage;

import java.io.CharArrayWriter;
import org.json.JSONArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xln {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/mdx/browserchannel/ChunkStream");
    public xma a;
    private int c;
    private int f = 1;
    private final CharArrayWriter d = new CharArrayWriter();
    private final CharArrayWriter e = new CharArrayWriter();

    public static final void a(int i) throws xmf, xmd {
        if (i == 404) {
            throw new xmd();
        }
        if (i != 200) {
            throw new xmf(i);
        }
    }

    public final void b(char[] cArr) {
        int i;
        int length = cArr.length;
        int i2 = 0;
        while (length != 0) {
            int i3 = this.f;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        this.d.write(cArr, i2, length);
                        i = length;
                        break;
                        break;
                    }
                    i = i5 + 1;
                    if (cArr[i2 + i5] == '\n') {
                        CharArrayWriter charArrayWriter = this.d;
                        charArrayWriter.write(cArr, i2, i5);
                        String string = charArrayWriter.toString();
                        try {
                            this.c = Integer.parseInt(string, 10);
                            this.f = 2;
                            this.d.reset();
                            break;
                        } catch (NumberFormatException e) {
                            ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/mdx/browserchannel/ChunkStream", "handleChunkSizeWrite", (char) 153, "ChunkStream.java")).w("Error parsing chunk length: %s", string);
                            this.f = 1;
                            this.d.reset();
                            break;
                        }
                    }
                    i5 = i;
                }
            } else {
                if (i4 != 1) {
                    i = length;
                    break;
                }
                int i6 = this.c;
                if (length >= i6) {
                    this.f = 1;
                    i = i6;
                } else {
                    i = length;
                }
                CharArrayWriter charArrayWriter2 = this.e;
                charArrayWriter2.write(cArr, i2, i);
                int i7 = this.c - i;
                this.c = i7;
                if (i7 == 0) {
                    xma xmaVar = this.a;
                    if (xmaVar != null) {
                        String string2 = charArrayWriter2.toString();
                        try {
                            agrx agrxVar = agso.a;
                            JSONArray jSONArray = new JSONArray(string2);
                            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                                JSONArray jSONArray2 = jSONArray.getJSONArray(i8);
                                int i9 = jSONArray2.getInt(0);
                                xmb xmbVar = xmaVar.b;
                                ((xly) xmbVar).h = i9;
                                JSONArray jSONArray3 = jSONArray2.getJSONArray(1);
                                if (jSONArray3.length() > 0) {
                                    if (i9 == 0) {
                                        ((xly) xmbVar).g = jSONArray3.getString(1);
                                    } else if (i9 == 1) {
                                        ((xly) xmbVar).i = jSONArray3.getString(1);
                                    } else if (i9 > 1) {
                                        xmaVar.c.b(jSONArray3);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            ((agrc) ((agrc) ((agrc) xma.a.b().i(agso.a, "MDX.browserchannel")).j(e2)).k("com/google/android/libraries/youtube/mdx/browserchannel/JsonChunkHandler", "handleChunk", '9', "JsonChunkHandler.java")).t("Chunk stream error");
                        }
                    }
                    this.e.reset();
                }
            }
            i2 += i;
            length -= i;
        }
    }

    protected final void finalize() {
        if (this.f == 2) {
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/mdx/browserchannel/ChunkStream", "close", 202, "ChunkStream.java")).t("Lost partial chunk");
        }
    }
}
