package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awx {
    public static final /* synthetic */ int a = 0;
    private static final agm b = new agm(2);
    private static final Comparator c = new awv(0);

    public static aami a(Context context, List list, CancellationSignal cancellationSignal) throws Exception {
        Cursor cursor;
        String[] strArr;
        Cursor cursorQuery;
        String str;
        int i;
        String str2;
        Typeface typefaceC;
        String str3 = "content";
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < list.size()) {
            awy awyVar = (awy) list.get(i3);
            if (Build.VERSION.SDK_INT < 31 || (typefaceC = avy.c((str2 = awyVar.f))) == null || avy.d(typefaceC) == null) {
                PackageManager packageManager = context.getPackageManager();
                Resources resources = context.getResources();
                List listC = awyVar.d;
                if (listC == null) {
                    listC = aub.c(resources, awyVar.e);
                }
                String str4 = awyVar.a;
                String str5 = awyVar.b;
                aww awwVar = new aww(str4, str5, listC);
                agm agmVar = b;
                ProviderInfo providerInfoResolveContentProvider = (ProviderInfo) agmVar.b(awwVar);
                if (providerInfoResolveContentProvider == null) {
                    providerInfoResolveContentProvider = packageManager.resolveContentProvider(str4, i2);
                    if (providerInfoResolveContentProvider == null) {
                        throw new PackageManager.NameNotFoundException(a.ce(str4, "No package found for authority: "));
                    }
                    if (!providerInfoResolveContentProvider.packageName.equals(str5)) {
                        throw new PackageManager.NameNotFoundException("Found content provider " + str4 + ", but package was not " + awyVar.b);
                    }
                    Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList2 = new ArrayList();
                    int length = signatureArr.length;
                    for (int i4 = i2; i4 < length; i4++) {
                        arrayList2.add(signatureArr[i4].toByteArray());
                    }
                    Comparator comparator = c;
                    Collections.sort(arrayList2, comparator);
                    int i5 = i2;
                    while (true) {
                        if (i5 >= listC.size()) {
                            providerInfoResolveContentProvider = null;
                            break;
                        }
                        ArrayList arrayList3 = new ArrayList((Collection) listC.get(i5));
                        Collections.sort(arrayList3, comparator);
                        if (arrayList2.size() == arrayList3.size()) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= arrayList2.size()) {
                                    agmVar.c(awwVar, providerInfoResolveContentProvider);
                                    break;
                                }
                                if (!Arrays.equals((byte[]) arrayList2.get(i6), (byte[]) arrayList3.get(i6))) {
                                    break;
                                }
                                i6++;
                            }
                        }
                        i5++;
                    }
                }
                if (providerInfoResolveContentProvider == null) {
                    return new aami();
                }
                String str6 = providerInfoResolveContentProvider.authority;
                ArrayList arrayList4 = new ArrayList();
                Uri uriBuild = new Uri.Builder().scheme(str3).authority(str6).build();
                Uri uriBuild2 = new Uri.Builder().scheme(str3).authority(str6).appendPath("file").build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                try {
                    String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    try {
                        String str7 = awyVar.g;
                        if (str7 == null) {
                            strArr = new String[]{awyVar.c};
                            break;
                        }
                        int length2 = str7.length();
                        int iCharCount = 0;
                        while (true) {
                            if (iCharCount >= length2) {
                                strArr = new String[]{awyVar.c};
                                break;
                            }
                            int iCodePointAt = str7.codePointAt(iCharCount);
                            if (!Character.isWhitespace(iCodePointAt)) {
                                strArr = new String[]{awyVar.c, "VF"};
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                        String[] strArr3 = strArr;
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr2, "query = ?", strArr3, null, cancellationSignal);
                            } catch (RemoteException e) {
                                Log.w("FontsProvider", "Unable to query the content provider", e);
                                cursorQuery = null;
                            }
                        } else {
                            cursorQuery = null;
                        }
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.getCount() > 0) {
                                    int columnIndex = cursorQuery.getColumnIndex("result_code");
                                    arrayList4 = new ArrayList();
                                    int columnIndex2 = cursorQuery.getColumnIndex("_id");
                                    int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                    int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                    int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                    int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                    while (cursorQuery.moveToNext()) {
                                        String str8 = str3;
                                        ArrayList arrayList5 = arrayList;
                                        arrayList4.add(new axd(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, awyVar.g, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                                        str3 = str8;
                                        arrayList = arrayList5;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                aao.b(contentProviderClientAcquireUnstableContentProviderClient);
                                throw th;
                            }
                        }
                        str = str3;
                        ArrayList arrayList6 = arrayList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        aao.b(contentProviderClientAcquireUnstableContentProviderClient);
                        i = 0;
                        arrayList = arrayList6;
                        arrayList.add((axd[]) arrayList4.toArray(new axd[0]));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            } else {
                axd[] axdVarArr = new axd[1];
                axdVarArr[i2] = new axd(str2, awyVar.g);
                arrayList.add(axdVarArr);
                str = str3;
                i = i2;
            }
            i3++;
            i2 = i;
            str3 = str;
        }
        return new aami((List) arrayList);
    }
}
