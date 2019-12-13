import React from 'react'
import { View, StyleSheet } from 'react-native'
import {
  PassbaseModule,
  PassbaseComponent
} from 'orgBasedTestRNRepo'

const styles = StyleSheet.create({
  container: {
    width: '100%',
    height: '100%',
    flexWrap: 'wrap'
  },
  component: {
    width: 100,
    height: 100,
    margin: 5
  }
})

class App extends React.Component<{}> {

  componentDidMount() {
    PassbaseModule.show('PassbaseModule')
  }

  render() {
    return (
      <View style={styles.container}>
        <PassbaseComponent
          style={styles.component}
          color={'#0e03ad'}
        />
      </View>
    )
  }
}

export default App
