package demo;

public class SortUtil
{
    public static <T> void ordenar(Precedable<T> arr[])
    {
        int l = arr.length;

        for(int i = 0; i < l; i++)
        {
            for(int j = 1; j < l - i; j++)
            {
                if(arr[j - 1].precedeA((T) arr[j]) > 0)
                {
                    Precedable<T> temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
