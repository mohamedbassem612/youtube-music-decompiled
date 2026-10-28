package defpackage;

import android.net.Uri;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csc implements crr {
    private static void b(JsonReader jsonReader, csb csbVar, Map map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                map.put(strNextName, csbVar.a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crr
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        try {
            int i = 8;
            boolean z = true;
            Throwable th = null;
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw new bsz("Steering manifest JSON should be an object at root", null, true, 8);
            }
            agjz agjzVar = new agjz(4);
            agjz agjzVar2 = new agjz(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            long jNextInt = -9223372036854775807L;
            int iNextInt = 1;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    iNextInt = jsonReader.nextInt();
                } else if (strNextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    jNextInt = ((long) jsonReader.nextInt()) * 1000;
                } else if (strNextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (strNextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    HashSet hashSet = new HashSet();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.peek().equals(JsonToken.STRING)) {
                            String strNextString = jsonReader.nextString();
                            if (!hashSet.add(strNextString)) {
                                throw new bsz(a.bT(strNextString, "The pathway ID (", ") appears more than once in the PATHWAY-PRIORITY array"), th, z, i);
                            }
                            agjzVar.h(strNextString);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endArray();
                    if (hashSet.isEmpty()) {
                        throw new bsz("The PATHWAY-PRIORITY array is present but empty", th, z, i);
                    }
                } else if (strNextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    jsonReader.beginArray();
                    boolean z2 = false;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                            jsonReader.beginObject();
                            String strNextString2 = th;
                            String strNextString3 = strNextString2;
                            cry cryVar = strNextString3;
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                if (strNextName2.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (strNextName2.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                                    strNextString3 = jsonReader.nextString();
                                } else {
                                    if (strNextName2.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                        jsonReader.beginObject();
                                        HashMap map = new HashMap();
                                        HashMap map2 = new HashMap();
                                        HashMap map3 = new HashMap();
                                        String strNextString4 = th;
                                        while (jsonReader.hasNext()) {
                                            String strNextName3 = jsonReader.nextName();
                                            if (strNextName3.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                                strNextString4 = jsonReader.nextString();
                                                if (strNextString4.isEmpty()) {
                                                    throw new bsz("The HOST string is present but empty", null, true, 8);
                                                }
                                            } else if (strNextName3.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                                final int i2 = 1;
                                                b(jsonReader, new csb() { // from class: csa
                                                    @Override // defpackage.csb
                                                    public final Object a(String str) {
                                                        return i2 == 0 ? Uri.parse(str) : str;
                                                    }
                                                }, map);
                                            } else if (strNextName3.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                                final int i3 = 0;
                                                b(jsonReader, new csb() { // from class: csa
                                                    @Override // defpackage.csb
                                                    public final Object a(String str) {
                                                        return i3 == 0 ? Uri.parse(str) : str;
                                                    }
                                                }, map2);
                                            } else if (strNextName3.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                                final int i4 = 0;
                                                b(jsonReader, new csb() { // from class: csa
                                                    @Override // defpackage.csb
                                                    public final Object a(String str) {
                                                        return i4 == 0 ? Uri.parse(str) : str;
                                                    }
                                                }, map3);
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                        jsonReader.endObject();
                                        cryVar = new cry(strNextString4, map, map2, map3);
                                    } else {
                                        jsonReader.skipValue();
                                        cryVar = cryVar;
                                    }
                                    th = null;
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString2 == 0) {
                                throw new bsz("BASE-ID field is missing in a PATHWAY-CLONE object", null, true, 8);
                            }
                            if (strNextString3 == 0) {
                                throw new bsz("ID field is missing in a PATHWAY-CLONE object", null, true, 8);
                            }
                            if (cryVar == 0) {
                                throw new bsz("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object", null, true, 8);
                            }
                            agjzVar2.h(new crx(strNextString2, strNextString3, cryVar));
                            th = null;
                            z2 = true;
                        } else {
                            jsonReader.skipValue();
                            th = null;
                        }
                    }
                    jsonReader.endArray();
                    if (!z2) {
                        throw new bsz("The PATHWAY-CLONES array is present but empty", null, true, 8);
                    }
                } else {
                    jsonReader.skipValue();
                }
                i = 8;
                z = true;
                th = null;
            }
            jsonReader.endObject();
            agke agkeVarG = agjzVar.g();
            if (agkeVarG.isEmpty()) {
                throw new bsz("PATHWAY-PRIORITY field is missing", null, true, 8);
            }
            crz crzVar = new crz(iNextInt, jNextInt, uri2, agkeVarG, agjzVar2.g());
            jsonReader.close();
            return crzVar;
        } catch (Throwable th2) {
            try {
                jsonReader.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
