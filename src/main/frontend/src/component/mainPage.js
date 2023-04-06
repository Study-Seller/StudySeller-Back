
import { Image, Menu, Input, Segment,
                         Grid,
                         Header,
                         Icon,
                         List, Button
                        } from 'semantic-ui-react'
import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import './my_design.css';



const App = () => {
  const [activeItem, setActiveItem] = useState('');

  const handleItemClick = (e, { name }) => setActiveItem(name);

  return (
    <Segment style={{padding: 0}}>
      <Menu style={{ backgroundColor: 'transparent' }} stackable inverted size='massive' fixed='top'  >
        <Menu.Item as={Link} to='/' style={{fontSize: '20px', color: 'grey'}}
 >
         StudySeller
        </Menu.Item>
        <Menu.Item
        style={{  fontSize: '20px', color: 'grey'}}
          as={Link}
          to='/'
          name='closest'
          active={activeItem === 'closest'}
          onClick={handleItemClick}
        />
        <Menu.Item
        style={{  fontSize: '20px', color: 'grey'}}
          as={Link}
          to='/'
          name='mostComments'
          active={activeItem === 'mostComments'}
          onClick={handleItemClick}
        />
        <Menu.Item
        style={{  fontSize: '20px', color: 'grey'}}
          as={Link}
          to='/'
          name='mostPopular'
          active={activeItem === 'mostPopular'}
          onClick={handleItemClick}
        />
         <Menu.Menu position='right'>
            <Menu.Item>
              <Input className='icon' icon='search' placeholder='Search...' size ='large' className='my-input' transparent/>
            </Menu.Item>
            <Menu.Item
            style={{fontSize: '20px', color: 'grey'}}
            name='signup'
            active={activeItem === 'signip'}
            onClick={handleItemClick}>
            Sign In
          </Menu.Item>
          <Menu.Item>
            <Button className="my-button">Sign Up!</Button>
          </Menu.Item>
         </Menu.Menu>
      </Menu>
      <Image src='./mainPage.jpg' fluid href='/' style={{paddingRight: -10}}/>
    </Segment>
  );
};

export default App;
