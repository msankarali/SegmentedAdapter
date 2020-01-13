# SegmentedAdapter

This library is designed to simplify the operation of RecyclerView(RV) with Databinding.  


RV for basic Adapter [Sample](https://github.com/GorkemKarayel/SegmentedAdapter/tree/master/app/src/main/java/com/karayel/segmentedadapter/basic) usage = 

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        rv_basic.setup(this).apply {
            adapter = basicAdapter
        }

        basicAdapter.sendData(getData())
    }

    private fun getData(): List<BasicItemModel> {
        return DummyObjCreator.getDummyUserList()
    }
```

RV for Segmented Adapter [Sample](https://github.com/GorkemKarayel/SegmentedAdapter/tree/master/app/src/main/java/com/karayel/segmentedadapter/segmented) usage = 

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segmented)

        rv_segmented.setup(this).apply {
            adapter = segmentedAdapter
        }

        segmentedAdapter.setDataSet(getData(),isSorted = false)
    }

    private fun getData(): List<TeamPlayerModel> {
        return DummyObjCreator.getDummyPlayerList()
    }
```

Note = There is a parameter(isSorted = true) which is in segmented adapter that is sorting headers (ASC)

Dependency
-------------

```kotlin
   allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
implementation 'com.github.GorkemKarayel:SegmentedAdapter:0.1.0’
```

# Links 

[Deep Dive RecyclerView](https://android.jlelse.eu/anatomy-of-recyclerview-part-1-a-search-for-a-viewholder-404ba3453714)

[RecyclerView for Beginner](https://android.jlelse.eu/understanding-recyclerview-a-high-level-insight-part-1-dc3f81af5720)

[Databinding](https://developer.android.com/topic/libraries/data-binding)




